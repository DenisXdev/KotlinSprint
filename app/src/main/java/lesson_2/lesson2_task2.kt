package lesson_2

fun main(){
    val numWorkers = 50
    val salaryWorkers = 30000
    val numTrainee = 30
    val salaryTrainee = 20000

    // Расходы на зарплату постоянных сотрудников
    val allSalaryWorkers = numWorkers * salaryWorkers
    println("Расходы на зарплату постоянных сотрудников: $allSalaryWorkers")

    // Общие расходы после прихода стажеров
    val allSalary = allSalaryWorkers + numTrainee * salaryTrainee
    println("Общие расходы после прихода стажеров: $allSalary")

    // Средняя зарплата
    val midSalary = allSalary / (numTrainee + numWorkers)
    println("Средняя зарплата после прихода стажеров: $midSalary")
}
