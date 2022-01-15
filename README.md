# Meu estudo no DevDojo
## Resumo
### Getters e Setters
É possível adicionar regra de negócio personalizada nos setters, o encapsulamento garante melhor segurança no código). 

### Construtor
Não há necessidade de criar um método para inicializar os atributos, o próprio construtor faz isso. Se você não criar nenhum construtor, vai ser criado o construtor vazio automaticamente. Uma classe pode ter diversos construtores, cada construtor pode inicializar objetos de maneiras diferentes. Por exemplo: um construtor vazio aceita valores vazios no objeto. 

### Modificador static
Exemplo, se um atributo static mudar de valor, esse valor muda em todos os objetos que ele está sendo usado, o atributo que tem como modificador static nunca é adicionado no construtor e para referenciá-lo em um método não usamos o .this, apenas chamamos pelo seu nome, para chamá-lo na Main chamamos a sua classe + nome do atributo = "novo valor";). O Java sempre vai dar prioridade para o número maior, então se você atribuir um valor para um atributo static e depois mudar esse valor, o valor mais alto vence. Se não estiver acessando atributos de classe (usa o .this) e só estiver recebendo parâmetros é possível transformar o método em static, mas se você estiver acessando atributos de classe não pode.

### Blocos de inicialização
Iniciam o código que o compõe antes de tudo, ele pode ser colocado em qualquer parte do código, mas uma boa prática é sempre deixá-lo antes do construtor e no início do código.
