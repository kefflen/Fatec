const BASE_URL = 'http://localhost:8080'

async function insere() {
  let id = Number(document.getElementById("pacienteId").value)
  let nome = document.getElementById("nome").value
  let cpf = document.getElementById("cpf").value
  let peso = Number(document.getElementById("peso").value)
  let altura = Number(document.getElementById("altura").value)
  let idade = Number(document.getElementById("idade").value)
  
  let objeto = {
    nome,
    cpf,
    peso,
    altura,
    idade
  }

  let verbo
  if (id) {
    objeto.id = id
    verbo = 'PUT'
  } else {
    verbo = 'POST'
  }

  await fetch(BASE_URL + '/paciente', {
    method: verbo, body: JSON.stringify(objeto),
    headers: {
      'Content-Type': 'application/json'
    }
  })

  clearForm()
  carregaTabela()
}

async function remove(id) {
  const resposta = confirm(`Deseja realmente excluir o paciente ${id}? `)
  if (resposta) {
    await fetch(BASE_URL + `/paciente/${id}`, {
      method: 'DELETE'
    })
    carregaTabela()
  }
}

function atualiza(id, nome, cpf, peso, altura, idade) {
  document.getElementById("pacienteId").value = id
  document.getElementById("nome").value = nome
  document.getElementById("cpf").value = cpf
  document.getElementById("peso").value = peso
  document.getElementById("altura").value = altura
  document.getElementById("idade").value = idade
}
async function carregaTabela() {

  const response = await fetch(BASE_URL + '/paciente')
  const pacientes = await response.json()
  let tableRows = pacientes.map(paciente => {
    const { nome, id, cpf, peso, altura, idade } = paciente
    return `<tr><td> ${id} </td> <td> ${nome} </td> <td> ${cpf} </td> <td> ${peso} </td> <td> ${altura} </td> <td> ${idade} </td> <td> <button onclick="remove(${id})">  <i class="bi bi-trash"></i> </button> </td> <td> <button onclick="atualiza(${id}, '${nome}', '${cpf}', ${peso}, ${altura}, ${idade})"> <i class="bi bi-pencil"></i> </button></td> </tr>`
  }).join('')
  document.getElementById("conteudoTabela").innerHTML = tableRows

}

function clearForm() {
  document.getElementById("pacienteId").value = null
  document.getElementById("nome").value = ''
  document.getElementById("cpf").value = ''
  document.getElementById("peso").value = null
  document.getElementById("altura").value = null
  document.getElementById("idade").value = null
}