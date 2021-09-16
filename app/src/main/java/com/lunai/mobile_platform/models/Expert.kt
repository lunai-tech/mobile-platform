package com.lunai.mobile_platform.models

import com.google.gson.annotations.SerializedName


data class Expert (

    @SerializedName("id")                 val id: String,
    @SerializedName("name")               val name: String,
    @SerializedName("nickname")           val nickname: String,
    @SerializedName("password")           val password: String,
    @SerializedName("date_birth")         val dateBirth: String,
    @SerializedName("cpf_cnpj")           val documentNumber: String,
    @SerializedName("gender")             val gender: String,
    @SerializedName("email")              val email: String,
    @SerializedName("type")               val type: String,
    @SerializedName("phone_number")       val phoneNumber: String,
    @SerializedName("price_hour")         val priceHour: String,
    @SerializedName("address")            val address: String,
    @SerializedName("skills")             val skills: List<String>,
    @SerializedName("jobs")               val jobs: List<String>,
    @SerializedName("status")             val status: String,

)