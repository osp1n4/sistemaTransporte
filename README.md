
#Sistema de transportes

* Lenguaje de programacion JAVA  version 17
* Intelij
* postman
* SprinBoot V 3.0.2


Logica en la terminal de transporte donde  la clase  persona que tiene los valores de los datos personales del usuario, heredando de la clase transporte que tiene como atributo cantidad de pasajero y destino optiene los datos personales, en la clase Usuario se crea una variable de tipo bus y una ArrayList de tipo Persona y en la clase Ticket,
Instanciamos una variable ArrayList de tipo Usuario y de tipo Persona, e inicializamos los atributos en el constructor para facilitar el registro de los usuarios con sus datos personales y destino de viaje

* PersonaController tenemos el registro de pasajeros, actualizacion y eliminar cada uno de las personas que estan de usuario en el bus. 
* El BusController tenemos el registro de buses con su informacion de cupo id, ver destino del bus, obtenemos la lista de los Buses actualizacion, y eliminacion 

Para una correcta ejecucion del programa levanta SprinBoot en intelij, y abrir el programa de postman.
Se debe pegar la siguiente url en postman en Get.

 A continuacion se debe configurar los metodos y pegar la url indicada para ver la informacion en el postman

* UsuarioController
@RestController
@RequestMapping("/api/v1/usuario")

Metodo: GET

URL: localhost:8080//api/v1/usuario/mostrarLista

Metodo:@PutMapping("/update")

Metodo:@PutMapping("/update")

* BusController
@RestController
@RequestMapping("api/v1/bus")
URL: localhost:8080/api/v1/

Metodo: GET
Metodo:@GetMapping("/lista")
Metodo:@PutMapping("/update")
Metodo: @DeleteMapping("/{idBus}")
