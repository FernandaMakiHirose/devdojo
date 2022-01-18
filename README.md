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
A maioria dos métodos da classe Date estão depreciados. Então, podemos usar o [Calendar](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) (mais completa e simples) até a versão 7 do Java, acima dessa versão é recomendado usar a classe [Time](https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html). Podemos formatar datas com o [Date Format](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html), internacionalização com o [Locale](https://docs.oracle.com/javase/7/docs/api/java/util/Locale.html), formatação de números e moeda com [NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html), datas personalizadas com [SimpleDateFormat](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html).

### Expressões Regulares
[Expressão Regular](https://www.devmedia.com.br/expressoes-regulares-em-java/21712) ou Regular Expression, bem como a abreviação RegEx, é um mecanismo poderoso utilizado para manipulação de informações baseadas em cadeias de caracteres dentro de um arquivo de texto. [Conceitos básicos sobre Expressões Regulares em Java](https://www.devmedia.com.br/conceitos-basicos-sobre-expressoes-regulares-em-java/27539). Duas classes são utilizadas, [Pattern](https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html) (procura padrões), [Matcher](https://docs.oracle.com/javase/7/docs/api/java/util/regex/Matcher.html) (encontra padrões) e [String](https://www.w3schools.com/java/java_strings.asp) e [Scanner](https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html) para trabalhar com tokens e delimitadores. 

### Resource Bundles
Usar [resource bundles](https://www.youtube.com/watch?v=sQeG5rgwGIQ&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=97) é pensar em internacionalização, traduzir palavras para outros idiomas. [Para criar](https://www.youtube.com/watch?v=OmeH6N4HI8U&list=PL62G310vn6nHrMr1tFLNOYP_c73m6nAzL&index=98): (Botão Direito) - New - Resource Bundle - (Depois adicione as localizações). A regra para criar o nome é adicionar a língua e o país: `messages_pt_BR.properties`. Para palavras que são iguais em todas as línguas: `messages.properties` e dentro adicionamos a regra de negócio específica. 

### IO
A classe [File](https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html) é usada para criar e manipular arquivos e diretório, [FileReader](https://developer.mozilla.org/pt-BR/docs/Web/API/FileReader): criar e ler arquivos, [BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html): faz o mesmo que o FileReader, só que mais otimizado, [FileWriter](https://docs.oracle.com/javase/7/docs/api/java/io/FileWriter.html): escreve em arquivos, [BufferedReader](https://docs.oracle.com/javase/7/docs/api/java/io/BufferedReader.html): otimiza a FilerWriter. Dica: para copiar o path de um diretório: (Botão Direito) - Copy Path. [Console](https://www.javatpoint.com/java-console-class), é necessário criar um arquivo txt com o código do `ConsoleTest.java` dentro, depois no terminal executar: `javac ConsoleTest.java` e depois `java ConsoleTest`.

### NIO
Introdução as classes [Path](https://docs.oracle.com/javase/7/docs/api/java/nio/file/Path.html): É uma interface, para ser criado é necessário o uso da classe Paths. [Paths](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html): Consiste em métodos estáticos que retornam a Path convertendo uma string de caminho ou URI, [Files](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html): Consiste em métodos estáticos que operam em arquivos, diretórios ou outros tipos de arquivos.

### Serialização
A [Serialização](https://www.devmedia.com.br/introducao-a-serializacao-de-objetos/3050) é muito usada em frameworks e APIs. A serialização é pegar um objeto e passá-lo por um fluxo de dados, transformando ele em bytes, e poderá ser armazenado em disco ou transmitido por um stream de objeto. O [FileOutputStream](https://docs.oracle.com/javase/7/docs/api/java/io/FileOutputStream.html) é um fluxo de arquivo que permite a gravação em disco. Já o [FileInputStream](https://docs.oracle.com/javase/7/docs/api/java/io/FileInputStream.html) é justamente o contrário, permitindo a leitura de um arquivo em disco. <br>
O processo de serialização de objetos é bastante utilizado em sistemas distribuídos (coleção de computadores independentes conectados por uma rede e equipados com um sistema de software distribuído) e na persistência de dados (manter dados além da duração da execução do programa). Com a transformação do objeto em bytes é possível enviar o objeto por uma rede, ou salvá-lo em um arquivo ou em um banco de dados.

## Coleções
- [Equals](https://www.devmedia.com.br/sobrescrevendo-o-metodo-equals-em-java/26484): verifica se dois objetos tem o conteúdo igual.  
- [Hashset](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html): não apresenta valores duplicados e ordenados. As únicas coisas que podemos fazer com esse conjunto é: estabelecer quais são seus membros e verificar se um item é um membro, e não possui índice. [Quando usar Hashset?](https://qastack.com.br/programming/1247442/when-should-i-use-the-hashsett-type), [Sobrescrevendo o método hashCode() em Java](https://www.devmedia.com.br/sobrescrevendo-o-metodo-hashcode-em-java/26488), [Qual a importância de implementar o método hashCode em Java?](https://pt.stackoverflow.com/questions/11108/qual-a-import%C3%A2ncia-de-implementar-o-m%C3%A9todo-hashcode-em-java)
- [LinkedList<E>](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html): você pode percorrer a lista para frente ou para trás, mas encontrar uma posição na lista leva um tempo proporcional ao tamanho da lista. Os principais benefícios do uso de um LinkedList surgem quando você reutiliza os iteradores existentes para inserir e remover elementos, os elementos tem mais sobrecarga quanto o ArrayList.
- [ArrayList<E>](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html): permite acesso rápido, adicionar ou remover de qualquer lugar, exceto o final, exige a troca de todos os últimos elementos. Além disso, se você adicionar mais elementos do que a capacidade, a matriz antiga será copiada para a nova matriz criada. Portanto, adicionar a um ArrayList é a pior das hipóteses, possui índice, iterar sobre um ArrayList é tecnicamente mais rápido. [Quando usar o LinkedList sobre o ArrayList em Java?](https://qastack.com.br/programming/322715/when-to-use-linkedlist-over-arraylist-in-java)
- [Comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html): permite comparar dois elementos e precisa ser implementada na classe desejada, fazer sobrescrita de seu método e criar a regra de negócio. Na classe main podemos ordenar os objetos em [ordem](https://www.javatpoint.com/Comparable-interface-in-collection-framework) crescente ou decrescente. Seu uso não é recomendado, porque mexe na classe principal, o certo é usar o Comparator.
- [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html): permite comparar dois elementos, ordenar na [ordem](https://www.javatpoint.com/Comparator-interface-in-collection-framework) crescente ou decrescente sem mexer na classe principal. A classe principal é criada, depois outras classes para comparação são criadas (também podem ser criadas no método main) e no método main a ordenação é executada).
- [Busca binária](https://www.devmedia.com.br/implementando-uma-busca-binaria-normal-e-recursiva/2792): retorna o índice do elemento encontrado no método `containsAll()`, enquanto sem busca binária o método retorna `true` ou `false`.
- No arquivo `ConversaoDeListasArraysTest` você aprende a converter Arrays em List e List em Arrays, em `IteratorTest` como remover elementos da lista com Iterator.
- [LinkedHashSet](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html): mantém a ordem de inserção, é mais lento que o HashSet, não permite elementos duplicados, não possui índice.
  
### Generics
A motivação de estudar [Generics](https://www.devmedia.com.br/usando-generics-em-java/28981) em Java é de poupar o desenvolvedor de códigos redundantes, como é o caso de casting excessivo. Este foi introduzido desde o Java SE 5.0. Vamos neste artigo abordar os principais usos e especificidades de Generics, para que você leitor possa entender o funcionamento do mesmo e utilizá-lo em seus projetos com maior frequência e facilidade.

### Classes internas
Como o próprio nome diz, são [classes](https://www.devmedia.com.br/aprendendo-sobre-classes-internas/15581) que são definidas dentro de outra classe. Sendo que elas tem um relacionamento especial com sua classe externa (classe onde ela está definida), em relação as outras classes. Pelo fato de que elas podem acessar os membros privados da classe externa. O que acontece, implicitamente a classe interna tem uma instância da classe externa.

### JDBC
JDBC significa Java™ EE Database Connectivity. No desenvolvimento Java EE, esta é uma tecnologia bem conhecida e comumente utilizada para a implementação da interação do banco de dados. JDBC é uma API de nível de chamada, o que significa que as instruções SQL são transmitidas como sequências para a API que, então, se encarrega de executá-las no RDMS. Consequentemente, o valor dessas sequências pode ser alterado no tempo de execução, tornando o JDBC dinâmico. <br>
Embora os programas JDBC sejam executados mais lentamente do que seus equivalentes SQLJ, uma vantagem dessa abordagem é um conceito conhecido como Escreva uma vez, chame em qualquer lugar. Isso significa que, como nenhuma interação é necessária até o tempo de execução, um programa JDBC é bastante móvel e pode ser levado entre diferentes sistemas, com gastos mínimos.

### Threads
[Threads](https://www.w3schools.com/java/java_threads.asp) permitem que um programa opere de forma mais eficiente fazendo várias coisas ao mesmo tempo. Os threads podem ser usados para executar tarefas complicadas em segundo plano sem interromper o programa principal.
