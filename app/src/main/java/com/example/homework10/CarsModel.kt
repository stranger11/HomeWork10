package com.example.homework10

data class CarsModel (
    val title: String,
    val description: String,
    val imgId: Int
)

val carData: ArrayList<CarsModel> = arrayListOf(
    CarsModel (
        "Audi",
        "Компания Audi является немецким производителем автомобилей.",
        R.drawable.audi
    ),
    CarsModel (
        "Bmw",
        "BMW - немецкая компания, которая выпускает автомобили и мотоциклы премиум класса.",

        R.drawable.bmwimage
    ),
    CarsModel (
        "Honda",
        "Компания Honda специализируется на производстве мотоциклов, легковых машин и техники специального назначения.",

        R.drawable.honda
    ),
    CarsModel (
        "Hyundai",
        "Hyundai Motor Company – компания из Южной Кореи, которая производит широкий спектр автомобильной техники.",

        R.drawable.hyundai
    ),
    CarsModel (
        "Subaru",
        "Subaru является специализирующимся на выпуске автомобилей подразделением концерна Fuji Heavy Industries Ltd.",
        R.drawable.subaru
    )
)