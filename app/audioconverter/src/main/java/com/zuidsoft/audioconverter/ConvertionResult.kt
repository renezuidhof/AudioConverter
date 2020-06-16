package com.zuidsoft.audioconverter

class ConversionResult {
    val convertCode: ConvertionCode
    var errorMessage: String? = null

    constructor() {
        convertCode = ConvertionCode.SUCCESS
    }

    constructor(errorMessage: String?) {
        convertCode = ConvertionCode.FAILED

        this.errorMessage = errorMessage
    }
}