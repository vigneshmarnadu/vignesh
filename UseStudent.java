package day2;

public class UseStudent {
	public static void main(String[]args) {
		Student student1 = new Student();
		student1.name="vignesh.M";
		student1.std="10th";
		student1.rollNum=1431;
		student1.tamilMark=78;
		student1.englishMark=87;
		student1.mathsMark=97;
		student1.biologyMark=98;
		student1.chemistryMark=78;
		student1.physicsMark=87;
		student1.totalMark=student1.tamilMark+student1.englishMark+student1.mathsMark+student1.biologyMark+student1.chemistryMark+student1.physicsMark;
		student1.averageMark=student1.totalMark/6;
		Student student2 = new Student();
		student2.name="vinoth.M";
		student2.std="10th";
		student2.rollNum=1432;
		student2.tamilMark=98;
		student2.englishMark=76;
		student2.mathsMark=67;
		student2.biologyMark=56;
		student2.chemistryMark=76;
		student2.physicsMark=84;
		student2.totalMark=student2.tamilMark+student2.englishMark+student2.mathsMark+student2.biologyMark+student2.chemistryMark+student2.physicsMark;
		student2.averageMark=student2.totalMark/6;
		
		System.out.println("Student Name  ="+student1.name+"    Average  ="+student1.averageMark);
		System.out.println("Student Name  ="+student2.name+"    Average  ="+student2.averageMark);

		
				
		
	}

}
