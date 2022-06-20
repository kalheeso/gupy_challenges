package algoritmos.distribuidora;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDistribuidora {
	
    private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		List<Distribuidora> distribuidoras = new ArrayList<>();
		Distribuidora distSp = new Distribuidora("SP", 67836.43);
		Distribuidora distRj = new Distribuidora("RJ", 36678.66);
		Distribuidora distMg = new Distribuidora("MG", 29229.88);
		Distribuidora distEs = new Distribuidora("ES", 27165.48);
		Distribuidora distOutros = new Distribuidora("Outros", 19849.53);

		Collections.addAll(distribuidoras, distSp, distRj, distMg, distEs, distOutros);
		System.out.println(df.format(distSp.porcentagemFaturamento(distribuidoras)));
		
		
	}

}


