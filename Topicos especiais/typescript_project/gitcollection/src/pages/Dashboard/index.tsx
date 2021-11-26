import React from 'react'
import { Title, Form, Repos } from './styles'
import logo from '../../assets/logo.svg'
import { api } from '../../services/api'

export const Dashboard: React.FC = () => {
  interface GithubRepository {
    full_name: string;
    description: string;
    owner: {
      login: string;
      avatar_url: string;
    }
  }

  const [novoRepositorio, setNovoRepositorio] = React.useState('')
  const [repositorios, setRepositorios] = React.useState<GithubRepository[]>([])

  function handleInputChange(event: React.ChangeEvent<HTMLInputElement>): void {
    setNovoRepositorio(event.target.value)
  }
  function handleAddRepository(event: React.FormEvent<HTMLFormElement>) {
    event.preventDefault()
    try {
      api
        .get<GithubRepository>(`/${novoRepositorio}`)
        .then(response => {
          let novoRepo = response.data
          setRepositorios([...repositorios, novoRepo])
          console.log(repositorios)
        })
    }
    catch {
      alert(`Problema ao consultar o repositório`)
    }
  }

  return (
    <>
      <img src={logo} alt="GitCollection" />
      <Title> Catálogo de repositórios do Github </Title>
      <Form onSubmit={handleAddRepository}>
        <input onChange={handleInputChange} placeholder="username/repository_name" />
        <button type="submit"> Buscar </button>
      </Form>
      <Repos>
        {
          repositorios.map((repositorio, index) => (
            <a href="/repo" key={`${repositorio.full_name}_${repositorio.owner}`}>
              <img
                src={repositorio.owner.avatar_url}
                alt={repositorio.owner.login} />
              <div>
                <strong> {repositorio.full_name} </strong>
                <p> {repositorio.description}</p>
              </div>
            </a>
          ))
        }
      </Repos>
    </>
  )
}