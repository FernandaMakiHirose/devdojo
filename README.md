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
Usamos a herança para o reaproveitamento de código, A subclasse estende da super classe com o “extends”, na subclasse não é possível remover atributos, métodos e estender outra classe, se você criar uma classe e ela não estende nenhuma classe, por padrão ela estende a classe Object. Na subclasse é criado um construtor que chama o super (define que o recurso pertence à super classe) e o this (define que o recurso pertence à classe atual.). [Herança (extends)](http://www.universidadejava.com.br/java/java-heranca/).

### Modificador final
O modificador final representa as constantes em Java, precisam sempre ser inicializados, não apresentam getters e setters e são escritas em letra maiúscula separada por underline: ```public static final double VELOCIDADE_FINAL = 250;```.
Métodos final nunca são sobrescritos e classes final nunca são estendidas. Para fazer a associação: ```public final Comprador COMPRADOR = new Comprador();```.

### Enum
Enum é uma "classe" especial para representar um grupo de constantes, segue a regra do PastelCase, seus valores são escritos em letra maiúscula. [Java Enums](https://www.w3schools.com/java/java_enums.asp).

### Classes abstratas
São classes que nunca podem ser instanciadas, se uma classe tiver um método abstrato ela vira uma classe abstrata, se você estende uma classe abstrata é necessário sobrescrever os métodos. Na UML escreva a classe e seus métodos em itálico ou se não for possível diga que ela é abstrata. Em classes abstratas podemos criar métodos abstratos ou métodos concretos (apresentam corpo). Se criar mais de uma classe abstrata, sendo subclasse de outra classe abstrata, a primeira classe concreta deve implementar todos os métodos abstratos que não foram implementados anteriormente. Ao sobrescrever os métodos, eles não apresentarão corpo, mas você pode copiar e colar o corpo da subclasse ou criar uma nova regra de negócio.

### Interfaces
Todos os métodos são públicos e abstratos, então não é necessário escrever que são públicos e abstratos no método, pois será redundante e todos seus atributos são constantes. É possível implementar uma interface, logo é necessário implementar todos os seus métodos. Interfaces podem ser implementadas mais de uma vez em uma mesma classe. O nome das interfaces precisa sempre terminar com "vel", exemplo: Transportavel, mas caso não consiga, coloque "I" na frente da palavra desejada, exemplo: IFuncionario. Seus métodos não tem corpo, o corpo é definido e moldado quando for implementado. Na UML, a interface é representada: ```<<Interface>>``` e uma seta com linha tracejada.

### Polimorfismo
É um mesmo método usado em outras classes, e com isso se comportando de forma diferente. <br>
Polimorfismo Sobrescrita: a mesma ação, podendo se comportar diferente, com a sobrescrita podemos sobrescrever o método, usar ele e adicionar novas funcionalidades. <br>
Polimorfismo Sobrecarga: a mesma operação implementada várias vezes na mesma classe.

### Exceptions
As exceções ocorrem quando algo imprevisto acontece, elas podem ser provenientes de erros de lógica ou acesso a recursos que talvez não estejam disponíveis. [Tratando exceções em Java](https://www.devmedia.com.br/tratando-excecoes-em-java/25514), [Entendendo Java Exceptions](https://www.devmedia.com.br/entendendo-java-exceptions/29812).

### Assertivas
Verifica valores, caso não seja o valor esperado, lançará um erro. Com o assert, não precisamos na maioria dos casos escrever condicionais gigantes, ele deve sempre ser implementado em métodos privados. [Para habilitá-lo no IntelliJ](https://www.youtube.com/watch?v=kd8L6jS8C3Q&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=78), vá em "Run" - Editar Configurações - VM opções: -ea. [Assertivas em Java](https://www.devmedia.com.br/assertivas-em-java/25835).

### Wrappers
Se temos Wrappers porque usar os tipos primitivos? Simples, eles são mais rápidos e consomem menos memória, afinal não tem implementação de métodos ou qualquer outro algoritmo complexo que venha a consumir mais tempo da JVM.
Unboxing Conversion: É quando deseja converter um objeto para um tipo primitivo.
Autoboxing Conversion: É quando deseja converter um tipo primitivo para um objeto.

### Strings
As [strings](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html) são imutáveis. Entre String, String Builder e String Buffer, a mais rápida é a [String Builder](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html).

### Date e Calendar
A maioria dos métodos da classe Date estão depreciados a partir do Java 7. Então, podemos usar o [Calendar](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) (mais completa e simples).

### Expressões Regulares
[Expressão Regular](https://www.devmedia.com.br/expressoes-regulares-em-java/21712) ou Regular Expression, bem como a abreviação RegEx, é um mecanismo poderoso utilizado para manipulação de informações baseadas em cadeias de caracteres. [Conceitos básicos sobre Expressões Regulares em Java](https://www.devmedia.com.br/conceitos-basicos-sobre-expressoes-regulares-em-java/27539).

### Resource Bundles
Usar [resource bundles](https://www.youtube.com/watch?v=sQeG5rgwGIQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=97) é pensar em internacionalização, traduzir palavras para outros idiomas. [Como criar resource bundles no IntelliJ?](https://www.youtube.com/watch?v=OmeH6N4HI8U&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=98)

### IO
A classe [File](https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html) é usada para criar e manipular arquivos e diretórios. [Documentação](https://docs.oracle.com/javase/7/docs/api/java/io/File.html). 

### NIO
Introdução as novas classes [Path, Paths, Files](https://www.javatpoint.com/java-nio).

### Serialização
Quando dizemos que um objeto é [serializado](https://www.devmedia.com.br/introducao-a-serializacao-de-objetos/3050), estamos afirmando que este objeto será transformado em bytes, e poderá ser armazenado em disco ou transmitido por um stream. O stream é um objeto de transmissão de dados, onde um fluxo de dados serial é feito através de uma origem e de um destino. Neste artigo vamos descrever dois tipos de stream, o FileOutputStream e o FileInputStream para manipular objetos serializados.

### Generics
A motivação de estudar [Generics](https://www.devmedia.com.br/usando-generics-em-java/28981) em Java é de poupar o desenvolvedor de códigos redundantes, como é o caso de casting excessivo. Este foi introduzido desde o Java SE 5.0. Vamos neste artigo abordar os principais usos e especificidades de Generics, para que você leitor possa entender o funcionamento do mesmo e utilizá-lo em seus projetos com maior frequência e facilidade.

### Classes internas
Como o próprio nome diz, são [classes](https://www.devmedia.com.br/aprendendo-sobre-classes-internas/15581) que são definidas dentro de outra classe. Sendo que elas tem um relacionamento especial com sua classe externa (classe onde ela está definida), em relação as outras classes. Pelo fato de que elas podem acessar os membros privados da classe externa. O que acontece, implicitamente a classe interna tem uma instância da classe externa.

### JDBC
JDBC significa Java™ EE Database Connectivity. No desenvolvimento Java EE, esta é uma tecnologia bem conhecida e comumente utilizada para a implementação da interação do banco de dados. JDBC é uma API de nível de chamada, o que significa que as instruções SQL são transmitidas como sequências para a API que, então, se encarrega de executá-las no RDMS. Consequentemente, o valor dessas sequências pode ser alterado no tempo de execução, tornando o JDBC dinâmico. <br>
Embora os programas JDBC sejam executados mais lentamente do que seus equivalentes SQLJ, uma vantagem dessa abordagem é um conceito conhecido como Escreva uma vez, chame em qualquer lugar. Isso significa que, como nenhuma interação é necessária até o tempo de execução, um programa JDBC é bastante móvel e pode ser levado entre diferentes sistemas, com gastos mínimos.

### Threads
[Threads](https://www.w3schools.com/java/java_threads.asp) permitem que um programa opere de forma mais eficiente fazendo várias coisas ao mesmo tempo. Os threads podem ser usados para executar tarefas complicadas em segundo plano sem interromper o programa principal.
