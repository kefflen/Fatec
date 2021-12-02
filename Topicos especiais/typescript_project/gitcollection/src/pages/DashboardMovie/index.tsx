import React from 'react'
import { Title, Form, Repos } from './styles'
import logo from '../../assets/logo.svg'
import { movieApi } from '../../services/api'

export const DashboardMovie: React.FC = () => {
  interface IMovie {
    Title: string
    Poster: string
    Plot: string
    Director: string
    Error?: any
  }

  const [newMovie, setNewMovie] = React.useState('')
  const [movies, setMovies] = React.useState<IMovie[]>([])

  function handleInputChange(event: React.ChangeEvent<HTMLInputElement>): void {
    setNewMovie(event.target.value)
  }
  async function handleAddRepository(event: React.FormEvent<HTMLFormElement>) {
    event.preventDefault()
    try {
      const response = await movieApi.get<IMovie>(`/?apikey=e62606e2&t=${newMovie.toLowerCase()}`)
      const optionalMovie = response.data
      if (!optionalMovie.Error) {
        setMovies([...movies, optionalMovie])
      } else {
        console.log("Algo deu errado!!!")
      }
    } catch (err) {
      console.log("Algo deu errado!!!")
    }
  }

  return (
    <>
      <img src={logo} alt="GitCollection" />
      <Title> Catalogo de filmes OMDB </Title>
      <Form onSubmit={handleAddRepository}>
        <input onChange={handleInputChange} placeholder="Digite o nome do filme..." />
        <button type="submit"> Buscar filme </button>
      </Form>
      <Repos>
        {
          movies.map((movie, index) => (
            <a href="/m" key={`${movie.Title}_${movie.Director}` + index}>
              <img
                src={movie.Poster}
                alt={movie.Title} />
              <div>
                <strong> {movie.Title} </strong>
                <p> {movie.Plot}</p>
              </div>
            </a>
          ))
        }
      </Repos>
    </>
  )
}