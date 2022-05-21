Algoritmo "Orientação a Objeto"

tipo
cadastroCliente = registro
 nome: caracter
 rg: caracter
 idade: inteiro
fimregistro

Var
clientes: vetor [1..3] de cadastroCliente
opcao: caracter
i: inteiro
rgPesquisa: caracter

Inicio

repita
 Escreval("1 - Cadastrar")
 Escreval("2 - Pesquisar")
 Escreval("3 - Sair")
 leia(opcao)

 se opcao = "1" entao
    para i de 1 ate 3 faca
     se clientes[i].nome = "" entao
        Escreval("Nome: ")
        Leia(clientes[i].nome)
        Escreval("RG: ")
        Leia(clientes[i].rg)
        Escreval("Idade: ")
        Leia(clientes[i].idade)
     interrompa
     fimse
    fimpara
 senao
  se opcao = "2" entao
    Escreval("Digite o RG")
    Leia(rgPesquisa)
     para i de 1 ate 3 faca
       se clientes[i].rg = rgPesquisa entao
       Escreval(clientes[i].nome, " encontrado.")
       interrompa
     fimpara
  fimse
 fimse
 fimse
ate opcao = "3"

Fimalgoritmo