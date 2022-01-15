# Meu estudo no DevDojo
## Resumo
### Encapsulamento
É a capacidade de esconder complexidade e proteger dados. trabalhamos com encapsulamento da seguinte forma: colocamos o atributo ou método desejado como privado e criamos o get e set como públicos (podemos personalizar a lógica do set) assim outras classes podem chamar os atributos ou métodos, ele evita o acesso direto a propriedade, adicionando uma camada extra de proteção.


### Getters e Setters
É possível adicionar regra de negócio personalizada nos setters, o encapsulamento garante melhor segurança no código). 

### Construtor
Não há necessidade de criar um método para inicializar os atributos, o próprio construtor faz isso. Se você não criar nenhum construtor, vai ser criado o construtor vazio automaticamente. Uma classe pode ter diversos construtores, cada construtor pode inicializar objetos de maneiras diferentes. Por exemplo: um construtor vazio aceita valores vazios no objeto. 

### Modificador static
Exemplo, se um atributo static mudar de valor, esse valor muda em todos os objetos que ele está sendo usado, o atributo que tem como modificador static nunca é adicionado no construtor e para referenciá-lo em um método não usamos o .this, apenas chamamos pelo seu nome, para chamá-lo na Main chamamos a sua classe + nome do atributo = "novo valor";). O Java sempre vai dar prioridade para o número maior, então se você atribuir um valor para um atributo static e depois mudar esse valor, o valor mais alto vence. Se não estiver acessando atributos de classe (usa o .this) e só estiver recebendo parâmetros é possível transformar o método em static, mas se você estiver acessando atributos de classe não pode.

### Blocos de inicialização
Iniciam o código que o compõe antes de tudo, ele pode ser colocado em qualquer parte do código, mas uma boa prática é sempre deixá-lo antes do construtor e no início do código. Para fazer um bloco de inicialização ser executado apenas uma vez o transformamos em static. 

### UML
Usamos o conceito "tem um".

- 1 (obrigatoriamente 1).
- 0..1 (0 ou 1).
- 1..* (um ou mais).
- 0..* (zero ou mais).
- apenas um asterisco (zero ou mais).

Exemplo: <br>
Um aluno tem 1 seminário: ```private Seminario seminario;``` <br>
Um seminário tem 1 ou mais alunos: ```private Aluno[] alunos;```

Relacionamentos: <br>
Bidirecional: Um aluno tem um seminário, um seminário tem vários alunos. Apresenta uma seta aberta. <br>
Unidirecional: Uma pessoa tem um endereço, um endereço não tem uma pessoa.

### Herança 
Usamos o conceito "é um" e é representada na UML com uma seta fechada.
Usamos a herança para o reaproveitamento de código, A subclasse estende da super classe com o “extends”, na subclasse não é possível remover atributos, métodos e estender outra classe, se você criar uma classe e ela não estende nenhuma classe, por padrão ela estende a classe Object. Na subclasse é criado um construtor que chama o super (define que o recurso pertence à super classe) e o this (define que o recurso pertence à classe atual.). [Documentação](http://www.universidadejava.com.br/java/java-heranca/).

### Modificador final
O modificador final representa as constantes em Java, precisam sempre ser inicializados, não apresentam getters e setters e são escritas em letra maiúscula separada por underline: ```public static final double VELOCIDADE_FINAL = 250;```.
Métodos final nunca são sobrescritos e classes final nunca são estendidas. Para fazer a associação: ```public final Comprador COMPRADOR = new Comprador();```.
