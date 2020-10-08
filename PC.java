package shiyan2;

public class PC {
	 CPU cpu;
	 Harddisk disk;
	 void setCPU(CPU cpu){
	  this.cpu=cpu;
	 }
	 void setHarddisk(Harddisk disk){
	  this.disk=disk; 
	 }
	 void show(){
	  System.out.println("CPU速度"+cpu.getSpeed());
	  System.out.println("CPU型号"+cpu.gettype());
	  System.out.println("硬盘容量"+disk.getAmount());
	  System.out.println("硬盘速度"+disk.getspeed2());
	 }
	 

}
