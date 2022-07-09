# Tarefa 011 - Padrões de Codificação (Leiaute e estilo), Reflexão e Programação defensiva - 08/07/2022

### Padrões de Codificação

Padrões de Codificação são regras empregadas durante a codificação com o objetive de facilitar a leitura e o entendimento do que está sendo realizado no código.
Embora todas as linguagens de programação tenham suas próprias regras, existe um grau de liberdade muito grande para qualquer ação realizada.

Em linguagem de maquina  espaços, identações ou mesmo quebras de linha não tem nenhuma influencia no funcionamento do código, de forma que o mesmo poderia ser escrito em uma única linha e ainda ser executado normalmente. Entretanto isso seria bem dificil de entender para qualquer pessoa. 

Exemplo: Dentre os dois 'while' abaixo, o segundo, que faz uso de indentação para indicar o que está contido nele é mais fácil de entender do que o primeiro, que tem a condição e a execução na mesma linha. 

<pre>
while (X>Y){X++;}

while (X>Y){
  X++;
}
</pre>

### Reflexão

Reflexão refere a capacidade de um programa de examinar e alterar sua própria estrutura ou comportamento durante seu tempo de execução. 

A reflexão pode ser usada, por exemplo, para a auto-otimização de um programa. Uma parte do programa responsavel por inspecionar o seu funcionamento, pode implementar um metodo diferente ao verificar que este funcionária melhor para o problema atual, sem haver a necessidade de recompilar o programa.

### Programação Defensiva

A Programação Defensiva consiste na criação de código já pensando em possiveis erros que um usuário pode encontrar e criando metodos de prevenção ou de gerenciamento desses erros, de forma que o software continue funcionando corretamente independente de erros cometidos.

Exemplo: No código abaixo é utilizada a função 'validadePassword()' para verificar se o usuário não inseriu nenhum elemento indesejavel em sua senha, por exemplo caracteres especiais, case sensitive, etc. E caso tenha feito isso o sistema irá tratar isso.

<pre>
public void setPassword(string Password){
  if(!validatePassword(Password)){
    throw new ArgumentException("Invalid password!");
  }
  else{
    this.password = password;
  }
}
</pre>

