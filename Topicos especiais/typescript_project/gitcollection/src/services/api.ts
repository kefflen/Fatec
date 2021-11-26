import axios from 'axios'

export const api = axios.create({
    baseURL: 'https://api.github.com/repos'
})

export const movieApi = axios.create({
  baseURL: 'http://www.omdbapi.com'
})