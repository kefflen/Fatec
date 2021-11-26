const BASE_URL = 'http://localhost:8080'

async function insere() {
  let id = Number(document.getElementById("medicoId").value)
  let nome = document.getElementById("nome").value
  let crm = document.getElementById("crm").value
  let especialidade = document.getElementById("especialidade").value
  
  let objeto = {
    nome,
    crm,
    especialidade
  }

  
  let verbo
  if (id) {
    objeto.id = id
    verbo = 'PUT'
  } else {
    verbo = 'POST'
  }
  console.log(objeto)

  await fetch(BASE_URL + '/medico', {
    method: verbo, body: JSON.stringify(objeto),
    headers: {
      'Content-Type': 'application/json',
    }
  })

  clearForm()
  carregaTabela()
}

async function remove(id) {
  const resposta = confirm(`Deseja realmente excluir o medico ${id}? `)
  if (resposta) {
    await fetch(BASE_URL + `/medico/${id}`, {
      method: 'DELETE'
    })
    carregaTabela()
  }
}

function atualiza(id, nome, cpf, peso) {
  document.getElementById("medicoId").value = id
  document.getElementById("nome").value = nome
  document.getElementById("crm").value = cpf
  document.getElementById("especialidade").value = peso
}

async function carregaTabela() {

  const response = await fetch(BASE_URL + '/medico')
  
  const medicos = await response.json()
  console.log(medicos)
  let tableRows = medicos.map(medico => {
    const { id, nome, crm, especialidade } = medico
    return `<tr><td> ${id} </td> <td> ${nome} </td> <td> ${crm} </td> <td> ${especialidade} </td>  <td> <button onclick="remove(${id})">  <i class="bi bi-trash"></i> </button> </td> <td> <button onclick="atualiza(${id}, '${nome}', '${crm}', '${especialidade}')"> <i class="bi bi-pencil"></i> </button></td> </tr>`
  }).join('')
  document.getElementById("conteudoTabela").innerHTML = tableRows

}

function clearForm() {
  document.getElementById("medicoId").value = null
  document.getElementById("nome").value = ''
  document.getElementById("crm").value = ''
  document.getElementById("especialidade").value = null
}