package ejercicio1

class RepositorioCompras {
    val listaCompra: MutableList<Compra> = mutableListOf()

    fun agregarCompra(compra: Compra) {
        listaCompra.add(compra)
    }

    fun solicitarDomicilio(cliente: Cliente): String {
        return cliente.domicilio
    }
}