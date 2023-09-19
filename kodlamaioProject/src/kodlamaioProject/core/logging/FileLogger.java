package kodlamaioProject.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String Data) {

		System.out.println("Dosyaya loglandı : " + Data);
	}

}
