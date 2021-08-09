import internal from "stream"

//Do tipo boolean
const isValid: boolean = true
//Do tipo number
const actualYear: number = 2020
//Do tipo string
const aula: string = "Iniciando com typescript"


//Outros tipos
let idade: any
idade= 18
idade = "Dezoito"

console.log({isValid, actualYear, aula, idade})

//Vetores - Arrays

const meses: string[] = ["Janeiro", "Fevereiro", "Março", "Abril", "Junho"]
const frutas: Array<string> = ["Laranja", "Banana"]

//Tuplas
const alunos: [string, number] = ["Alysson", 21]
console.log(alunos)

//Enums
enum Techs {
    Node, Typescript, TypeORM, React, PostgreeSQL
}

console.log(Techs.Node)

//Objetos

interface Aluno {
    nome: string
    idade: number
    publica: boolean
    notas: number[]
    calcularMedias(): void
}

const aluno1 :Aluno = {
    nome: "Alysson", idade: 18, 
    publica: true, notas: [1,2,3,4], 
    calcularMedias() {
        let soma = this.notas.reduce((total, number) => total + number, 0)
        console.log(soma/this.notas.length)
    }
}

aluno1.calcularMedias()

class Estudante implements Aluno {
    nome: string
    idade: number
    publica: boolean
    notas: number[]
    constructor (nome: string, idade: number, publica: boolean) {
        this.nome = nome
        this.idade = idade
        this.publica = publica
        this.notas = Array<number>()
    }
    calcularMedias() {
        
    }
}

interface Saudacao {
    bomDia(nome: string): void
    boaTarde(nome: string): void
    boaNoite(nome: string): void
}

class Superior {
    protected titulacao: string
    constructor(titulacao: string) {
        this.titulacao = titulacao
    }
}

class Professor extends Superior implements Saudacao {
    #nome: string = ""
    constructor(nome: string, titulacao: string) {
        super(titulacao)
        this.nome = nome
    }

    get nome() {
        return this.#nome
    }

    set nome(value) {
        this.#nome = value.trim()
    }

    bomDia(nome: string) {
        console.log(`${this.titulacao} ${this.nome}: Bom dia, ${nome}`)
    }
    boaTarde(nome: string) {
        console.log(`${this.titulacao} ${this.nome}: Boa tarde, ${nome}`)
    }
    boaNoite(nome: string) {
        console.log(`${this.titulacao} ${this.nome}: Boa noite, ${nome}`)
    }
}
let prof1 = new Professor("Daniel", "Doutor")
prof1.boaTarde("Fulano")
prof1.boaNoite("Fuluno2")
prof1.bomDia("Fuluno3")


