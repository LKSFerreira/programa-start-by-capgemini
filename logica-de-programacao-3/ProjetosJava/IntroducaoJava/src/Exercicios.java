import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {

            /*
             * Exemplo estrutura FOR
             * 
             * int tabuada = 2;
             * 
             * for (int i = 0; i <= 10; i++) {
             * int resultado = tabuada * i;
             * System.out.println(resultado);
             * }
             */

            /*
             * Exmplo estrutura WHILE
             * 
             * int condition = 0;
             * int numero = 2;
             * 
             * while (condition <= 5) {
             * 
             * numero = numero * numero;
             * System.out.println(numero);
             * condition++;
             * }
             */

            /*
             * Exercício 35
             * 
             * System.out.println("Digite o consumo do cliente em KWh");
             * int consumoKWh = leitor.nextInt();
             * 
             * System.out.println("Digite o tipo do cliente");
             * System.out.println("1 - Residencial, 2 - Comercial ou 3 - Industrial");
             * int tipoCliente = leitor.nextInt();
             * 
             * switch (tipoCliente) {
             * case 1:
             * System.out.println("Valor consumido: R$" + (consumoKWh*0.60));
             * break;
             * case 2:
             * System.out.println("Valor consumido: R$" + (consumoKWh*0.48));
             * break;
             * case 3:
             * System.out.println("Valor consumido: R$" + (consumoKWh*1.29));
             * break;
             * default:
             * System.out.println("Tipo de cliente inválido");
             * break;
             * }
             */

            /*
             * Exercício 34
             * 
             * System.out.println("Digite a idade do(a) nadador(a)");
             * int idadeNadador = leitor.nextInt();
             * 
             * if (idadeNadador >= 5 && idadeNadador <= 7) {
             * System.out.println("Nadador(a) na categoria Infantil A");
             * } else if (idadeNadador >= 8 && idadeNadador <= 10) {
             * System.out.println("Nadador(a) na categoria Infantil B");
             * } else if (idadeNadador >= 11 && idadeNadador <= 13) {
             * System.out.println("Nadador(a) na categoria Juvenil A");
             * } else if (idadeNadador >= 14 && idadeNadador <= 17) {
             * System.out.println("Nadador(a) na categoria Juvenil B");
             * } else if (idadeNadador >= 18 && idadeNadador <= 25) {
             * System.out.println("Nadador(a) na categoria Sênior");
             * } else {
             * System.out.println("Idade fora da faixa etária");
             * }
             */

            /*
             * Exercicio 33
             * 
             * System.out.println("Digite o nome do(a) professor(a)");
             * String nomeProf = leitor.nextLine();
             * 
             * System.out.println("Digite o nível do(a) " + nomeProf);
             * System.out.println("1 - Nível 1, 2 - Nível 2 ou 3 - Nível 3");
             * int nivelProf = leitor.nextInt();
             * 
             * System.out.println("Quantas horas o(a) " + nomeProf + " trabalhou?");
             * float horasProf = leitor.nextInt();
             * 
             * switch (nivelProf) {
             * case 1:
             * System.out.println("O salário do(a) " + nomeProf + " é de R$" + (12 *
             * horasProf));
             * break;
             * case 2:
             * System.out.println("O salário do(a) " + nomeProf + " é de R$" + (17 *
             * horasProf));
             * break;
             * case 3:
             * System.out.println("O salário do(a) " + nomeProf + " é de R$" + (25 *
             * horasProf));
             * break;
             * default:
             * System.out.println("Nível inválido, por gentileza verifique o valor digitado"
             * );
             * break;
             * }
             */

            /*
             * Exercício 32
             * 
             * System.out.println("Digite 3 valores sucessivamente");
             * int aLado = leitor.nextInt();
             * int bLado = leitor.nextInt();
             * int cLado = leitor.nextInt();
             * 
             * if (bLado + cLado > aLado && aLado + cLado > bLado && aLado + bLado > cLado)
             * {
             * if (aLado == bLado && bLado == cLado) {
             * System.out.println("Triângulo Equilátero");
             * } else if (aLado == bLado || bLado == cLado || aLado == cLado) {
             * System.out.println("Triângulo Isóscele");
             * } else {
             * System.out.println("Triângulo Escaleno");
             * }
             * } else {
             * System.out.println("As medidas não formam um triângulo");
             * }
             */

            /*
             * Exercício 31
             * 
             * float aValor = 0;
             * float bValor = 0;
             * char operador = '/';
             * 
             * while (bValor == 0 && operador == '/') {
             * System.out.
             * println("Digite os 2 números consecutivamente com quais deseja trabalhar");
             * aValor = leitor.nextFloat();
             * bValor = leitor.nextFloat();
             * 
             * System.out.println("Digite um operador matemático");
             * System.out.
             * println("(+) soma, (-) subtração, (*) multiplicação ou (/) divisão");
             * operador = leitor.next().charAt(0);
             * 
             * if (operador == '/' && bValor == 0) {
             * System.out.println("Não é possível realizar uma divisão por 0");
             * } else {
             * switch (operador) {
             * case '+':
             * System.out.println("Soma: " + (aValor + bValor));
             * break;
             * case '-':
             * System.out.println("Subtração: " + (aValor - bValor));
             * break;
             * case '*':
             * System.out.println("Multiplicação: " + (aValor * bValor));
             * break;
             * case '/':
             * System.out.println("Divisão: " + (aValor / bValor));
             * break;
             * default:
             * System.out.println("Operador inválido");
             * break;
             * }
             * }
             * }
             */

            /*
             * Exercício 30
             * 
             * System.out.println("Digite 3 números inteiros consecutivamente");
             * int numero1 = leitor.nextInt();
             * int numero2 = leitor.nextInt();
             * int numero3 = leitor.nextInt();
             * 
             * if (numero1 < numero2 && numero2 < numero3) {
             * System.out.println(numero1 + " " + numero2 + " " + numero3);
             * } else if (numero2 < numero1 && numero1 < numero3) {
             * System.out.println(numero2 + " " + numero1 + " " + numero3);
             * } else {
             * System.out.println(numero3 + " " + numero1 + " " + numero2);
             * }
             */

            /*
             * Exercício 29
             * 
             * System.out.println("Digite o número do mês");
             * int numero = leitor.nextInt();
             * 
             * switch (numero) {
             * case 1:
             * System.out.println("Janeiro");
             * break;
             * case 2:
             * System.out.println("Fevereiro");
             * break;
             * case 3:
             * System.out.println("Março");
             * break;
             * case 4:
             * System.out.println("Abril");
             * break;
             * case 5:
             * System.out.println("Maio");
             * break;
             * case 6:
             * System.out.println("Junho");
             * break;
             * case 7:
             * System.out.println("Julho");
             * break;
             * case 8:
             * System.out.println("Agosto");
             * break;
             * case 9:
             * System.out.println("Setembro");
             * break;
             * case 10:
             * System.out.println("Outubro");
             * break;
             * case 11:
             * System.out.println("Novembro");
             * break;
             * case 12:
             * System.out.println("Dezembro");
             * break;
             * default:
             * System.out.println("Número do mês inválido");
             * break;
             * }
             */

            /*
             * Exercício 28
             * 
             * String nomeColaborador;
             * float salarioColaborador;
             * char continua = 's';
             * float folhaPagamento = 0;
             * 
             * System.out.println("Digite o valor do salário mínimo");
             * float salarioMinimo = leitor.nextFloat();
             * 
             * while (continua == 's' || continua == 'S') {
             * 
             * System.out.println("Digite o nome do colaborador");
             * nomeColaborador = leitor.next();
             * 
             * System.out.println("Digite o salario do(a) " + nomeColaborador);
             * salarioColaborador = leitor.nextFloat();
             * 
             * if (salarioColaborador < (salarioMinimo * 3)) {
             * folhaPagamento = folhaPagamento + (salarioColaborador * 50 / 100);
             * salarioColaborador = salarioColaborador + (salarioColaborador * 50 / 100);
             * } else if (salarioColaborador >= (salarioMinimo * 3) && salarioColaborador <=
             * (salarioMinimo * 10)) {
             * folhaPagamento = folhaPagamento + (salarioColaborador * 20 / 100);
             * salarioColaborador = salarioColaborador + (salarioColaborador * 20 / 100);
             * } else if (salarioColaborador > (salarioMinimo * 10)) {
             * folhaPagamento = folhaPagamento + (salarioColaborador * 15 / 100);
             * salarioColaborador = salarioColaborador + (salarioColaborador * 15 / 100);
             * }
             * 
             * System.out.println("O novo salário do(a) " + nomeColaborador + " é de R$" +
             * salarioColaborador);
             * 
             * System.out.println("Deseja continuar? S - Sim ou N - Não");
             * continua = leitor.next().charAt(0);
             * }
             * 
             * System.out.println("Acressímo total na folha de pagamento R$" +
             * folhaPagamento);
             */

            /*
             * Exerício 27
             * 
             * float valorVeiculo = -1;
             * float valorDesconto = 0;
             * float totalDesconto = 0;
             * float totalVeiculos = 0;
             * int combustivelVeiculo = -1;
             * 
             * while (valorVeiculo != 0) {
             * System.out.println("Digite o valor do veículo");
             * valorVeiculo = leitor.nextFloat();
             * 
             * if (valorVeiculo != 0) {
             * 
             * while (combustivelVeiculo != 1 && combustivelVeiculo != 2 &&
             * combustivelVeiculo != 3) {
             * System.out.println("Digite o tipo de combustivel");
             * System.out.println("1 - Etanol, 2 - Gasolina ou 3 - Diesel ");
             * combustivelVeiculo = leitor.nextInt();
             * }
             * 
             * if (combustivelVeiculo == 1) {
             * 
             * valorDesconto = (valorVeiculo * 25 / 100);
             * System.out.println("Valor do desconto R$" + valorDesconto);
             * totalDesconto = totalDesconto + valorDesconto;
             * 
             * valorVeiculo = valorVeiculo - valorDesconto;
             * System.out.println("Valor do veículo R$" + valorVeiculo);
             * totalVeiculos = totalVeiculos + valorVeiculo;
             * 
             * } else if (combustivelVeiculo == 2) {
             * 
             * valorDesconto = (valorVeiculo * 21 / 100);
             * System.out.println("Valor do desconto R$" + valorDesconto);
             * totalDesconto = totalDesconto + valorDesconto;
             * 
             * valorVeiculo = valorVeiculo - valorDesconto;
             * System.out.println("Valor do veículo R$" + valorVeiculo);
             * totalVeiculos = totalVeiculos + valorVeiculo;
             * 
             * } else {
             * valorDesconto = (valorVeiculo * 14 / 100);
             * System.out.println("Valor do desconto R$" + valorDesconto);
             * totalDesconto = totalDesconto + valorDesconto;
             * 
             * valorVeiculo = valorVeiculo - valorDesconto;
             * System.out.println("Valor do veículo R$" + valorVeiculo);
             * totalVeiculos = totalVeiculos + valorVeiculo;
             * }
             * 
             * combustivelVeiculo = -1;
             * 
             * }
             * 
             * }
             * 
             * System.out.println("Total de desconto R$" + totalDesconto);
             * System.out.println("Valor total dos veículos R$" + totalVeiculos);
             */

            /*
             * Exercício 26
             * 
             * System.out.println("Digite um número de 1 a 5");
             * int numero = leitor.nextInt();
             * 
             * switch (numero) {
             * case 1:
             * System.out.println("Um");
             * break;
             * case 2:
             * System.out.println("Dois");
             * break;
             * case 3:
             * System.out.println("Três");
             * break;
             * case 4:
             * System.out.println("Quatro");
             * break;
             * case 5:
             * System.out.println("Cinco");
             * break;
             * default:
             * System.out.println("número inválido");
             * break;
             * }
             */

            /*
             * Exercício 25
             * 
             * System.out.println("");
             * System.out.println("Digite dois números sucessivamente");
             * int numero1 = leitor.nextInt();
             * int numero2 = leitor.nextInt();
             * 
             * if (numero1 == numero2) {
             * System.out.println("Os número são iguais");
             * } else {
             * System.out.println("Os números são diferentes");
             * if (numero1 > numero2) {
             * System.out.println("O primeiro número: " + numero1 +
             * " é maior que o segundo número " + numero2);
             * } else {
             * System.out.println("O segundo número: " + numero2 +
             * " é maior que o primeiro número " + numero1);
             * }
             * }
             */

            /*
             * Exercício 24
             * 
             * char condition = 'S';
             * 
             * while (condition == 'S' || condition == 's') {
             * 
             * System.out.println("Digite um número");
             * int x = leitor.nextInt();
             * 
             * if (x >= 1) {
             * System.out.println("O número digitado é POSITVO");
             * } else if (x <= -1) {
             * System.out.println("O número é NEGATIVO");
             * } else {
             * System.out.println("O numero é ZERO");
             * }
             * 
             * System.out.println("Deseja continuar? s - sim / n - não");
             * condition = leitor.next().charAt(0);
             * }
             */

            /*
             * Exercício 23
             * 
             * System.out.println("Digite um número");
             * float numero = leitor.nextFloat();
             * 
             * if (numero > 80 || numero < 25 || numero == 40) {
             * System.out.println("Mensagem mostrada");
             * }
             */

            /*
             * // Exercício 22
             * float precoCusto;
             * float precoVenda;
             * float totalCusto = 0;
             * float totalVendas = 0;
             * int numeroVendas = 3;
             * 
             * for (int i = 0; i < numeroVendas; i++) {
             * System.out.
             * println("Digite o preço de custo e de venda do produto respectivamente");
             * precoCusto = leitor.nextFloat();
             * precoVenda = leitor.nextFloat();
             * 
             * if (precoVenda == precoCusto) {
             * System.out.println("Sem lucro ou prejuízo nessa venda");
             * System.out.println("Valor de custo do produto R$ " + precoCusto);
             * System.out.println("Valor de venda do produto R$ " + precoVenda);
             * } else {
             * if (precoVenda > precoCusto) {
             * System.out.println("Lucro na venda");
             * System.out.println("Valor de custo do produto R$ " + precoCusto);
             * System.out.println("Valor de venda do produto R$ " + precoVenda);
             * } else {
             * System.out.println("Prejuízo na venda");
             * System.out.println("Valor de custo do produto R$ " + precoCusto);
             * System.out.println("Valor de venda do produto R$ " + precoVenda);
             * }
             * }
             * totalCusto = totalCusto + precoCusto;
             * totalVendas = totalVendas + precoVenda;
             * }
             * 
             * float mediaCusto = totalCusto / numeroVendas;
             * float mediaVendas = totalVendas / numeroVendas;
             * System.out.println("A média do custo é de R$ " + mediaCusto);
             * System.out.println("A média de vendas é de R$ " + mediaVendas);
             */

            /*
             * Exercício 21
             * 
             * char continua = 's';
             * String nome;
             * int idade;
             * char genero;
             * int saude = 0;
             * boolean generoBoolean = false;
             * int aptos = 0;
             * int naoAptos = 0;
             * 
             * while (continua == 's' || continua == 'S') {
             * 
             * System.out.println("Digite o nome");
             * nome = leitor.next();
             * 
             * System.out.println("Digite a idade");
             * idade = leitor.nextInt();
             * 
             * System.out.println("Digite M - Masculino ou F - Feminino");
             * genero = leitor.next().charAt(0);
             * if (genero == 'm' || genero == 'M') {
             * generoBoolean = true;
             * } else {
             * generoBoolean = false;
             * }
             * 
             * System.out.
             * println("Digite 1 - Saudável ou 2 - Caso tenho algum problema de saúde");
             * saude = leitor.nextInt();
             * 
             * if (generoBoolean && idade >= 18 && saude == 1) {
             * System.out.println(nome + "esta apto ao serviço militar");
             * aptos++;
             * } else {
             * System.out.println(nome + "Não esta apto ao serviço militar");
             * naoAptos++;
             * }
             * 
             * System.out.println("Deseja continuar? S - Sim ou N - Não");
             * continua = leitor.next().charAt(0);
             * }
             * 
             * System.out.println("Total de candidatos aptos: " + aptos);
             * System.out.println("Total de candidatos não aptos: " + naoAptos);
             */

            /*
             * Exercício 20
             * 
             * int numeroCarros = 0;
             * int totalCarro = 0;
             * float valorCarro = 0;
             * int anoCarro = 0;
             * char resposta = 's';
             * 
             * while (resposta == 's' || resposta == 'S') {
             * System.out.println("Qual valor do carro?");
             * valorCarro = leitor.nextFloat();
             * 
             * System.out.println("Qual ano do veículo");
             * anoCarro = leitor.nextInt();
             * 
             * if (anoCarro <= 2000) {
             * System.out.println("Desconto :" + (valorCarro * 12 / 100));
             * valorCarro = valorCarro - (valorCarro * 12 / 100);
             * System.out.println("Valor à pagar: " + valorCarro);
             * numeroCarros++;
             * } else {
             * System.out.println("Desconto :" + (valorCarro * 7 / 100));
             * valorCarro = valorCarro - (valorCarro * 7 / 100);
             * System.out.println("Valor à pagar: " + valorCarro);
             * totalCarro++;
             * }
             * 
             * System.out.println("Deseja continuar? S - Sim ou N - não");
             * resposta = leitor.next().charAt(0);
             * 
             * }
             * 
             * System.out.println(" ");
             * System.out.println("Veículo de ano até 2000: " + numeroCarros);
             * System.out.println("Total geral de carros: " + (totalCarro + numeroCarros));
             */

            /*
             * Exercício 19
             * 
             * char genero;
             * String nome;
             * boolean testaGenero = true;
             * int masculino = 0;
             * int feminino = 0;
             * 
             * for (int i = 0; i < 3; i++) {
             * 
             * System.out.println("Digite seu nome");
             * nome = leitor.nextLine();
             * 
             * System.out.println("Digite M - Masculino ou F - Feminino");
             * genero = leitor.nextLine().charAt(0);
             * 
             * if (genero == 'm' || genero == 'M' || genero == 'f' || genero == 'F') {
             * testaGenero = false;
             * } else {
             * testaGenero = true;
             * }
             * 
             * while (testaGenero) {
             * System.out.println("Opção inválida");
             * System.out.println("Digite M - Masculino ou F - Feminino");
             * genero = leitor.nextLine().charAt(0);
             * if (genero == 'm' || genero == 'M' || genero == 'f' || genero == 'F') {
             * testaGenero = false;
             * }
             * }
             * 
             * if (genero == 'm' || genero == 'M') {
             * System.out.println(nome + " - homem");
             * masculino++;
             * } else {
             * System.out.println(nome + " - mulher");
             * feminino++;
             * }
             * 
             * }
             * 
             * System.out.println("Total de homens: " + masculino);
             * System.out.println("total de mulheres: " + feminino);
             */

            /*
             * Exercício 18
             * 
             * int idade = 0;
             * 
             * for (int i = 0; i < 5; i++) {
             * 
             * System.out.println("Digite a idade");
             * idade = leitor.nextInt();
             * 
             * if (idade >= 18) {
             * System.out.println("Maior de idade");
             * } else {
             * System.out.println("Menor de idade");
             * }
             * 
             * }
             */

            /*
             * Exercício 17
             * 
             * int intervalo10 = 0;
             * int intervalo150 = 0;
             * 
             * for (int i = 0; i < 5; i++) {
             * 
             * System.out.println("Digite um número");
             * int numero = leitor.nextInt();
             * 
             * if (numero <= 10) {
             * intervalo10++;
             * intervalo150++;
             * } else {
             * intervalo150++;
             * }
             * }
             * 
             * System.out.println("Existem " + intervalo10 + " números entre 0 e 10.");
             * System.out.println("Existem " + intervalo150 + " números entre 0 e 150.");
             */

            /*
             * Exercício 16
             * 
             * System.out.println("Digite o nome do aluno");
             * String nomeAluno = leitor.nextLine();
             * 
             * System.out.println("Digite as notas do aluno");
             * float nota1 = leitor.nextFloat();
             * float nota2 = leitor.nextFloat();
             * float nota3 = leitor.nextFloat();
             * 
             * float mediaNotasAluno = (nota1 + nota2 + nota3) / 3;
             * 
             * if (mediaNotasAluno >= 7) {
             * System.out.println("Parabéns, " + nomeAluno + " aprovado");
             * } else if (mediaNotasAluno <= 5) {
             * System.out.println("Infelizmente, " + nomeAluno + " reprovado");
             * } else {
             * System.out.println("Ainda há esperança, " + nomeAluno + " de recuperação");
             * }
             */

            /*
             * Exercicio 15
             * 
             * if (numero >= 100 && numero <= 200) {
             * System.out.println("O número esta no intervalo");
             * } else {
             * System.out.println("O número não esta no intervalo");
             * }
             */

            /*
             * Exercício 14
             * 
             * System.out.println("Digite dois valores respctivamente");
             * int valor1 = leitor.nextInt();
             * int valor2 = leitor.nextInt();
             * 
             * if (valor1 > valor2) {
             * System.out.println("O maior valor é " + valor1);
             * } else if (valor2 > valor1) {
             * System.out.println("O maior valor é " + valor2);
             * } else {
             * System.out.println("Os valores são iguais");
             * }
             */

            /*
             * Exercício 12
             * 
             * System.out.println("Qual o preço de custo do carro?");
             * float precoCarro = leitor.nextFloat();
             * float imposto = 28f / 100;
             * float porcentagemDistribuidora = 48f / 100;
             * 
             * precoCarro = (precoCarro + (precoCarro * imposto));
             * precoCarro = precoCarro + (precoCarro * porcentagemDistribuidora);
             * 
             * System.out.println("O valor final do veículo é de " + precoCarro);
             */

            /*
             * Exercício 11
             * 
             * System.out.println("Qual o valor de custo do produto?");
             * float valorCusto = leitor.nextFloat();
             * 
             * System.out.println("Qual a porcentagem de acressímo para venda?");
             * float valorPorcentagem = (leitor.nextFloat()) / 100;
             * float valorVenda = valorCusto + (valorCusto * valorPorcentagem);
             * 
             * System.out.println("O valor de venda do produto é de R$ " + valorVenda);
             */

            /*
             * Exercico 10
             * 
             * System.out.println("Digite o valor total das compras");
             * float valorCompras = leitor.nextFloat();
             * 
             * float valorPrestacao = valorCompras / 5;
             * 
             * System.out.println("Valor das parcelas é de R$ " + valorPrestacao);
             */

            /*
             * Exercício 09
             * 
             * System.out.println("Qual valor depositado?");
             * float valorDepositado = leitor.nextFloat();
             * 
             * System.out.println("Quantos meses deseja simular?");
             * int meses = leitor.nextInt();
             * 
             * float jurosPoupanca = 0.07f;
             * for (int i = 1; i <= meses; i++) {
             * valorDepositado = valorDepositado + (valorDepositado * (jurosPoupanca /
             * 100));
             * }
             * 
             * System.out.println("O valor total após " + meses + " meses é de R$ " +
             * valorDepositado);
             */

            /*
             * Exercício 07
             * 
             * System.out.println("Qual o valor deseja converter em Real(R$)");
             * float dolarUsuario = leitor.nextFloat();
             * System.out.println("Qual a cotação de 1 Dolar(US$) para Real(R$)");
             * float cotacaoReal = leitor.nextFloat();
             * 
             * float valorConvertido = dolarUsuario * cotacaoReal;
             * 
             * System.out.println("O valor em Reais(R$) é de " + valorConvertido);
             */

            /*
             * Exerício 07
             * System.out.println("Digite a temperatura em graus celsius");
             * float C = leitor.nextFloat();
             * float F = (9 * C + 160) / 5;
             * 
             * System.out.println("A temperatura em graus Fahrenheit é de " + F);
             */

            /*
             * Exercício 06
             * 
             * System.out.println("Digite um número inteiro para o valor da variável A");
             * int valorA = leitor.nextInt();
             * 
             * System.out.println("Digite um número inteiro para o valor da variável B");
             * int valorB = leitor.nextInt();
             * 
             * int aux = valorA;
             * valorA = valorB;
             * valorB = aux;
             * 
             * System.out.println("O valor da variável A é " + valorA);
             * System.out.println("O valor da variável B é " + valorB);
             */

            /*
             * Exercício 05
             * 
             * System.out.println("Digite o nome do aluno");
             * String nomeAluno = leitor.nextLine();
             * 
             * System.out.println("Digite as notas do aluno respectivamente");
             * float nota1 = leitor.nextFloat();
             * float nota2 = leitor.nextFloat();
             * float nota3 = leitor.nextFloat();
             * 
             * float mediaNotasAluno = (nota1 + nota2 + nota3) / 3;
             * 
             * System.out.println("O média do " + nomeAluno + " é de " + mediaNotasAluno);
             */

            /*
             * Exercício 04
             * 
             * System.out.println("Digite o nome do vendedor");
             * String nomeVendedor = leitor.nextLine();
             * 
             * System.out.println("Digite o salário do vendedor");
             * float salarioVendedor = leitor.nextFloat();
             * 
             * System.out.println("Digite o total de vendas do mês");
             * float totalVendas = leitor.nextFloat();
             * 
             * float comissaoVendedor = 0.15f;
             * float salarioFinalVendedor = salarioVendedor +
             * (totalVendas*comissaoVendedor);
             * 
             * System.out.println("O salario do " + nomeVendedor + " é de R$ " +
             * salarioFinalVendedor);
             */

            /*
             * Exercício 03
             * 
             * System.out.println("Digite a distância total percorrida em KM");
             * float kmTotal = leitor.nextFloat();
             * 
             * System.out.println("Digite a quantidade de combustível gasto em Litros");
             * float combustivelTotal = leitor.nextFloat();
             * 
             * float consumoMedio = combustivelTotal / kmTotal;
             * 
             * System.out.println("O consumo médio do seu veículo é de: " + consumoMedio +
             * "Litros por KM");
             */

            /*
             * Exercício 02
             * 
             * int num1 = leitor.nextInt();
             * int num2 = leitor.nextInt();
             * 
             * int soma = num1 + num2;
             * int sub = num1 - num2;
             * int mult = num1 * num2;
             * float div = num1 / num2;
             * 
             * System.out.println("Valor da soma: " + soma);
             * System.out.println("Valor da subtração: " + sub);
             * System.out.println("Valor da multiplicação: " + mult);
             * System.out.println("Valor da divisão: " + div);
             */

            /*
             * Exercício 01
             * 
             * int num1 = leitor.nextInt();
             * int num2 = leitor.nextInt();
             * 
             * int soma = num1 + num2;
             * System.out.println("O valor da soma é de: " + soma);
             */
        }

    }

}
