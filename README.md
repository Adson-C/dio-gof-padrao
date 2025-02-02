﻿# dio-gof-padrao

##  Singleton
Garantir que uma classe tenha apenas uma instância no sistema e fornecer um ponto global de acesso a essa instância.

> - Características:

É usado para situações em que é necessário gerenciar recursos compartilhados, como conexões de banco de dados, arquivos de log ou configurações globais.
A classe controla sua própria instância e impede a criação de múltiplas instâncias.

##  Strategy
Definir uma família de algoritmos, encapsulá-los em classes separadas e permitir que sejam intercambiáveis em tempo de execução.

> - Características:

Facilita a substituição ou adição de novos comportamentos sem modificar o código que os utiliza.
Promove o princípio aberto/fechado (OCP): "aberto para extensão, fechado para modificação".

##  Facade
Fornecer uma interface simplificada para um conjunto complexo de classes, bibliotecas ou sistemas.

> - Características:

Ajuda a esconder a complexidade do subsistema, expondo apenas o que é essencial para o cliente.
Reduz o acoplamento entre o cliente e as classes internas do subsistema.
