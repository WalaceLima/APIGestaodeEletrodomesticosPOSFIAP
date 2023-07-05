# API Eletrodoméstico 


API de gestão de eletrodomésticos tem como objetivo permitir o cadastro e gerenciamento de informações sobre os aparelhos eletrônicos dos usuários cadastrados em nosso sistema.
Recebe as informações dos eletrônicos com os campos de nome, modelo, potência e outras informações relevantes.
Recebe as solicitações em formato HTTP POST.
As informações são validadas para garantir que elas estão no formato correto e que são válidas.
Caso haja algum erro, a API retorna uma mensagem de erro indicando o problema encontrado.
Uma vez validadas as informações, a API informa que está tudo ok e dar um retorno positivo ao usuário.



### Endpoint: 
- /eletrodomesticos
      
### Método HTTP:
- Post

### Descrição:
Este endpoint cria um novo eletrodoméstico com base nos parâmetros fornecidos.
Neste exemplo, o endpoint é do tipo POST e os parâmetros de solicitação são enviados no corpo da solicitação em formato JSON. Os parâmetros incluem nome, marca e voltagem, que são utilizados para criar um novo eletrodoméstico.

### Parâmetros no corpo da solicitação (JSON):

![Picture1](https://s4.aconvert.com/convert/p3r68-cdx67/ai332-mzxrc.png)

Exemplo de solicitação:
- POST /eletrodomesticos

#### Exemplo de solicitação:

![Picture2](https://s4.aconvert.com/convert/p3r68-cdx67/am6uw-02oso.png)

Formato de resposta:
Cabeçalho HTTP:

#### Corpo da resposta (JSON):

![Picture3](https://s4.aconvert.com/convert/p3r68-cdx67/asnob-n6fjs.png)

#### Lidando com Erros

A API possui um mecanismo robusto para lidar com erros e fornece respostas adequadas para diferentes cenários. A seguir estão os possíveis códigos de status que podem ser retornados em diferentes situações:

#### Corpo da solicitação.

![Picture4](https://s4.aconvert.com/convert/p3r68-cdx67/a2nug-vji87.png)

- Resposta 201 Created: Este código de status é retornado quando uma solicitação de criação de recurso é bem-sucedida.

#### Corpo da solicitação inválida:

![Picture5](https://s4.aconvert.com/convert/p3r68-cdx67/ak4zd-gdvji.png)

![Picture6](https://s4.aconvert.com/convert/p3r68-cdx67/a9rml-iqlud.png)

- 400 Bad Request: Este código de status é retornado quando ocorre um erro no lado do cliente, como uma solicitação inválida ou parâmetros ausentes ou inválidos.

### Repositório API:
- [API de Gestão de Eletrodomésticos](https://github.com/WalaceLima/APIGestaodeEletrodomesticosPOSFIAP.git).

