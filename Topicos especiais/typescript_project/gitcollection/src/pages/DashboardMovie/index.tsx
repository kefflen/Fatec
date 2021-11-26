import React from 'react'
import { Title, Form, Repos } from './styles'
import logo from '../../assets/logo.svg'
import { movieApi } from '../../services/api'

export const DashboardMovie: React.FC = () => {
  interface MovieRepository {
    Title: string
    Poster: string
    Plot: string
    Writer: string
    Director: string
    PLot: string
  }

  const [newMovie, setNewMovie] = React.useState('')
  const [movies, setMovies] = React.useState<MovieRepository[]>([])

  function handleInputChange(event: React.ChangeEvent<HTMLInputElement>): void {
    setNewMovie(event.target.value)
  }
  function handleAddRepository(event: React.FormEvent<HTMLFormElement>) {
    event.preventDefault()
    movieApi.get(`/?apikey=e857f5df&t=${newMovie}`)
      .then(response => response.data)
      .then(data => {
        if (!data.Error) {
          let repositoriesCollection = [...movies, data]
          setMovies(repositoriesCollection)
        }
      })
  }

  return (
    <>
      <img src={logo} alt="GitCollection" />
      <Title> Catalogo de filmes </Title>
      <Form onSubmit={handleAddRepository}>
        <input onChange={handleInputChange} placeholder="movie_name" />
        <button type="submit"> Buscar </button>
      </Form>
      <Repos>
        {
          movies.map((movie, index) => (
            <a href="/m" key={`${movie.Title}_${movie.Director}`+index}>
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