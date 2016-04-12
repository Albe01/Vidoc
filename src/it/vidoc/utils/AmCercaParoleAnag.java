package it.vidoc.utils;

import java.util.ArrayList;
import java.util.List;

import it.vidoc.mybatis.sqlquery.SqlStrNomi;

public class AmCercaParoleAnag {
	private String alberto = null;
	private List<Integer> listKanagra = new ArrayList<Integer>();
	
	public AmCercaParoleAnag() {
		listKanagra.clear();		
	}
	
	public List<Integer> amCercaParoleAnag(String parola, String tipoParola) {
		if (tipoParola.equals("nome")) {
			listKanagra = new SqlStrNomi().getStrNomi(parola);
		}
		
		
		
		
//		if (tipoParola.equals("prvres")) {
//			StrcodprvresMapperExt strcodprvresMapperExt = sqlSession.getMapper(StrcodprvresMapperExt.class);
//			StrcodprvresExample strcodprvresExample = new StrcodprvresExample();
//			strcodprvresExample.createCriteria().andParolaEqualTo(parola);
//			List<Strcodprvres> listKanagraPrvRes = strcodprvresMapperExt.selectKanagra(strcodprvresExample);
//			for (int i = 0; i < listKanagraPrvRes.size(); i++) {
//				listKanagra.add(listKanagraPrvRes.get(i).getKanagra());
//			}
//		}
		return listKanagra;
	}
}
