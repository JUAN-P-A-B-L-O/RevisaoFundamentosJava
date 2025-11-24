 ----- Exception
  Hierarquia + custom exceptions

Existem três categorias principais de condições excepcionais:

Exceções verificadas
Exceções não marcadas 
/ Exceções em tempo de execução
Erros


Exceções marcadas são exceções que o compilador Java exige que tratemos
Exceções não marcadas são exceções que o compilador Java não exige que lidemos.

finally sempre roda


Java nos permite lidar com exceções de subclasses separadamente

mais de uma exception no mesmo catch  } catch (IOException | NumberFormatException e) {
