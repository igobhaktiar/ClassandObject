// primary constructor empty
class Truck() {
    var name: String = "default"
    var model: String = "default"
    private var engine: String = "default"
    private var brand: String = ""

    // secondary constructor
    constructor(name: String, model: String): this() {
        this.name = name
        this.model = model
    }

    // multiple constructor
    constructor(engine: String): this() {
        this.engine = engine
    }

    constructor(engine: Int): this() {
        this.engine = engine.toString()
    }

    constructor(name: String, model: String, engine: String): this() {

    }

    constructor(name: String, model: String, engine: String, brand: String): this() {

    }

}