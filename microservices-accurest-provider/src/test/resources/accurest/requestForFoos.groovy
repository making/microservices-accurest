io.codearte.accurest.dsl.GroovyDsl.make {
    request {
        method 'GET'
        urlPath '/foos'
    }
    response {
        status 200
        body( """[ {
        "value" : 42
      }, {
        "value" : 100
      } ]""")
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}