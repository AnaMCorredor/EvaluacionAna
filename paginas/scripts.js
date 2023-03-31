$(document).ready(function () {


    //alert("Aqui aplico   con jquery")
  
    $('#Mostrar').on('click', function () {
  
        let tabla = document.querySelector('#UsuariosTabla')
  
        tabla.innerHTML = ''
  
        $.ajax({
            url: "http://localhost:8080/suma", // ubicacion de los documentos 
            type: "GET",
            datatype: "JSON", // el tipo de dato
            success: function (respuesta) {
  
                console.log(respuesta)
  
                for (p in respuesta) { // for para agregar los nuevos usuarios
  
                    tabla.innerHTML += '</td><td>' + respuesta[p].cedula+
                    '</td><td>' + respuesta[p].nombbre+
                    '</td><td>' + respuesta[p].apellido+
                    '</td><td>' + respuesta[p].cargo+
                    '</td><td>' + respuesta[p].salario+
                    '</td><td>' + respuesta[p].exnocturna+
                    '</td><td>' + respuesta[p].exfestivas+
                    '</td><td>' + respuesta[p].ventas+
                    '</td><td>' + respuesta[p].comision+
                    '</td></tr>' // Elegimos el dato que necesitamos
  
                }
  
            }
        });
    });



    function ponerdaticos(respuesta){
        document.querySelector('#cedulanueva').setAttribute('value', respuesta['cedula']),
        document.querySelector('#nombrenuevo').setAttribute('value', respuesta['nombbre']),
        document.querySelector('#apellidonuevo').setAttribute('value', respuesta['apellido']),
        document.querySelector('#cargonuevo').setAttribute('value', respuesta['cargo']),
        document.querySelector('#salarionuevo').setAttribute('value', respuesta['salario']),
        document.querySelector('#extrasnuevas1').setAttribute('value', respuesta.exfestivas[0]),
        document.querySelector('#extrasnuevas2').setAttribute('value', respuesta.exfestivas[1]),
        document.querySelector('#extrasnuevas3').setAttribute('value', respuesta.exfestivas[2]),
        document.querySelector('#extrasnuevas4').setAttribute('value', respuesta.exfestivas[3]),
        document.querySelector('#extrasnuevas5').setAttribute('value', respuesta.exfestivas[4]),

        document.querySelector('#extrasnuevasdos1').setAttribute('value', respuesta.exnocturna[0]),
        document.querySelector('#extrasnuevasdos2').setAttribute('value', respuesta.exnocturna[1]),
        document.querySelector('#extrasnuevasdos3').setAttribute('value', respuesta.exnocturna[2]),
        document.querySelector('#extrasnuevasdos4').setAttribute('value', respuesta.exnocturna[3]),
        document.querySelector('#extrasnuevasdos5').setAttribute('value', respuesta.exnocturna[4]),

        document.querySelector('#ventanuevauno').setAttribute('value', respuesta.ventas[2])
    }

    $('#Buscar').on('click', function(){
        let cedula = parseInt($('#buscarcedula').val());
    
        $.ajax({
            url:"http://localhost:8080/buscarempleado/" + cedula,
            type: "GET",
            datatype: JSON,
            success: function(respuestaBus){            
                console.log(respuestaBus);
                ponerdaticos(respuestaBus)
            }
        })
    });

    $('#actualizarempleado').on('click', function(){
        
        let datos= {
            cedula:parseInt($('#cedulanueva').val()),
            nombbre:$('#nombrenuevo').val(),
            apellido:$('#apellidonuevo').val(),
            cargo:$('#cargonuevo').val(),
            salario:parseInt($('#salarionuevo').val()),
            exnocturna: [parseInt($('#extrasnuevas1').val()),parseInt($('#extrasnuevas2').val()),parseInt($('#extrasnuevas3').val()),parseInt($('#extrasnuevas4').val()),parseInt($('#extrasnuevas5').val())],
            exfestivas: [parseInt($('#extrasnuevasdos1').val()),parseInt($('#extrasnuevasdos2').val()),parseInt($('#extrasnuevasdos3').val()),parseInt($('#extrasnuevasdos4').val()),parseInt($('#extrasnuevasdos5').val())],
            ventas: [parseInt($('#ventanuevauno').val())]
        }
        let datosEnviados= JSON.stringify(datos);
        $.ajax({
            url:"http://localhost:8080/actualizar",
            type: "PUT",
            data: datosEnviados,
            contentType: "application/JSON",
            datatype: "JSON",
            success: function(respuesta){            
                alert(respuesta);            
            }
        })
    });



  });