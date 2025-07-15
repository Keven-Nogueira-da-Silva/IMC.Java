📝 Descrição do Projeto – Calculadora de IMC com Menu em Java
Este projeto consiste no desenvolvimento de uma calculadora de IMC (Índice de Massa Corporal) utilizando a linguagem de programação Java, com o objetivo de reforçar o uso de estruturas de repetição, condicionais (switch-case e if-else) e entrada de dados com a classe Scanner.

O programa inicia exibindo um menu interativo, no qual o usuário pode escolher entre as seguintes opções:

1 – Calcular o IMC com base no peso e altura informados.
2 – Ver a classificação do IMC de acordo com as faixas estabelecidas pela OMS.
0 – Sair do programa.

Ao escolher a opção 1, o programa solicita ao usuário que digite o seu peso (em quilogramas) e altura (em metros). Em seguida, o cálculo do IMC é feito pela fórmula:

IMC = peso / (altura * altura)
O valor calculado é armazenado em uma variável para ser utilizado posteriormente.

Ao escolher a opção 2, o programa verifica se o IMC já foi calculado. Se não tiver sido, o usuário é informado de que precisa primeiro calcular o IMC. Caso o IMC já esteja disponível, o programa analisa o valor e exibe uma classificação de acordo com a seguinte tabela:

Abaixo de 18.5 → Abaixo do peso

De 18.5 até 24.9 → Peso normal

De 25.0 até 29.9 → Sobrepeso

De 30.0 até 34.9 → Obesidade grau I

De 35.0 até 39.9 → Obesidade grau II

A partir de 40.0 → Obesidade grau III

O loop principal (while) garante que o menu continue aparecendo até o usuário escolher a opção 0, que finaliza o programa de forma segura.
