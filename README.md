# BatalhaNaval
Integrantes:
- Arthur Ribeiro Melo
- Valter dos Santos Simão Júnior
## Introdução
  O professor Saulo Henrique Cabral propôs a implementação de um jogo de batalha naval com o intuito de praticar conceitos básicos de programação bem como a prática de programação em Java, utilizando matrizes, POO, tratamento de eventos, laços de repetição e interfaces gráficas. No jogo de Batalha Naval, o usuário irá enfrentar o computador e deverá inicialmente posicionar três navios em um tabuleiro e deverá, posteriormente, atacar o tabuleiro adversário tentando atacar os navios inimigos.

O tabuleiro possui um tamanho de 10 x 5, onde as embaracações disponíveis para distribuir no tabuleiro são: 1 cruzador (duas células), 1
fragrata (três células) e 1 porta-aviões (quatro células).

![image](https://github.com/Arthur-R-Melo/BatalhaNaval/assets/103610549/ecb57f5a-5f49-4a80-a5dc-28f1dddde1e3)

## Implementação
### Da Partida
A classe Partida representa o confronto do usuário com a IA e sua classe controller correspondente será a principal conexão dos modelos com a view. É a partir da classe controller da partida que as classes de view poderão solicitar dados como o jogador vitorioso, o número de acertos de cada jogador, além de ter como função informar erros de entrada de usuário. Também é competência da Partida gerenciar os ataques e o posicionamento dos navios, retornando possíveis erros e informando às classes modelo quais modificações devem ser realizadas.

### Do Tabuleiro
A classe Tabuleiro é utilizada para representar cada lado do tabuleiro do jogo original, utilizando de uma matriz de inteiros e constantes para cada estado de uma dada posição. É papel da classe Tabuleiro realizar as devidas atualizações solicitadas pela partida e é função de sua respectiva classe Control validar o posicionamento de um navio e converter uma posição em formato letra + número para um par ordenado que possa ser usado para indicar uma posição na matriz de inteiros.

### Dos Jogadores
As classes de Jogador representam um jogador da partida e possui um tabuleiro. Sua principal função é de informar à partida as decisões do jogador e pode ser feito de duas formas a depender do tipo de jogador. Caso o jogador em questão seja uma máquina, são gerados valores aleatórios para posicionar um navio ou para atacar o adversário. Caso seja o próprio usuário, a classe Jogador utiliza de seu respectivo Controller para solicitar a View a decisão do jogador.

### Do Navio
O Navio é representado por um Enumerate, que contém pré definidamente os possíveis tipos de navio a serem posicionados no Tabuleiro com seu respectivo tamanho. A classe Navio não possui nenhuma função e é usada meramente como um modelo para o programa.
### Da GUI
A interação com o usuário feita com o uso da interface gráfica foi feita em grande parte utilizando o GuiBuilder da biblioteca Swing, porém para melhor manipulação das informações existe um método no qual cria e armazena em uma matriz os JPanels referentes ao tabuleiro. Ao pressionar para iniciar a partida, as informações da entrada do usuário são armazenadas em variáveis temporárias e são verificadas uma a uma no controller, em caso de erro, é informado ao usuário e o que era correto se trava para evitar futuras alterações. Com a partida iniciada, é necessário saber onde o usuário deseja atacar, por isso é utilizado um ActionListener em cada JPanel do tabuleiro inimigo, que se caso seja pressionado, ele encaminha os dados do ataque para o controller e logo após atualiza as posições atacadas de ambos jogadores.
