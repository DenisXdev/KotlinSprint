package lesson_2

fun main(){
    val numWorkers = 50
    val salaryWorkers = 30000
    val numTrainee = 30
    val salaryTrainee = 20000

    // ������� �� �������� ���������� �����������
    val allSalaryWorkers = numWorkers * salaryWorkers
    println("������� �� �������� ���������� �����������: $allSalaryWorkers")

    // ����� ������� ����� ������� ��������
    val allSalary = allSalaryWorkers + numTrainee * salaryTrainee
    println("����� ������� ����� ������� ��������: $allSalary")

    // ������� ��������
    val midSalary = allSalary / (numTrainee + numWorkers)
    println("������� �������� ����� ������� ��������: $midSalary")
}
