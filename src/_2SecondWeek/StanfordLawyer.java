package _2SecondWeek;

public class StanfordLawyer extends Lawyer {
   public double getSalary() {
       return super.getSalary() + (super.getSalary() * 0.20);
   }
   public int getVacationDays() {
       return super.getVacationDays() + 3;
   }

    public String getVacationForm() {
        return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
    }
}
