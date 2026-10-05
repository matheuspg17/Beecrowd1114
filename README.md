# Resolução exercício Beecrowd1114

## Descrição do problema
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 

## Como Funciona
1. O programa inicia com uma variável `controle = 1` e utiliza um laço `for` adaptável que aumenta o limite de iterações para cada tentativa incorreta.
2. Dentro do laço, o algoritmo captura o número inteiro digitado pelo usuário na variável `senha`.
3. Uma estrutura condicional `switch(senha)` valida a tentativa:
   - `case 2002`: Imprime `"Acesso Permitido"`, altera `controle = 0` para forçar o encerramento do loop e encerra o bloco.
   - `default`: Captura qualquer outro valor digitado, imprime `"Senha Invalida"`, incrementa a variável `controle++` para permitir uma nova iteração e encerra o bloco.