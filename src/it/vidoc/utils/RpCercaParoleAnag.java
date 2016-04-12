package it.vidoc.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import it.vidoc.mybatis.javaclient.ext.StrnomiMapperExt;

public class RpCercaParoleAnag {
	private ArrayList<Long> listKanagra = new ArrayList<Long>();
	
	public RpCercaParoleAnag() {
		listKanagra.clear();		
	}
	
	public ArrayList<Long> RpCercaParoleAnag(final String parola) {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSession();
		RpCercaParoleAnag rpCercaParoleAnag = new RpCercaParoleAnag();
		
		
		StrnomiMapperExt strnomiMapperExt = sqlSession.getMapper(StrnomiMapperExt.class);
		Map<String, String> param = new HashMap<String, String>();
		CreaNomeTabStringhe creaNomeTabStringhe = new CreaNomeTabStringhe();
		param.put("tableName", creaNomeTabStringhe.creaNomeTabStringhe("nome", parola.length()));
		param.put("parola", parola);
//		List<Strnomi03> listKanagraNomi = strnomiMapperExt.selectKanagra(param);
		List<Integer> listKanagraNomi = strnomiMapperExt.selectKanagra(param);
//		for (int i = 0; i < listKanagraNomi.size(); i++) {
//			listKanagra.add(listKanagraNomi.get(i).getKanagra());
//		} 

		
//		Strnomi03Mapper strnomi03Mapper = sqlSession.getMapper(Strnomi03Mapper.class);
//		Map<String, String> param = new HashMap<String, String>();
//		CreaNomeTabStringhe creaNomeTabStringhe = new CreaNomeTabStringhe();
//		param.put("tableName", creaNomeTabStringhe.CreaNomeTabStringhe("A", parola.length()));
//		param.put("parola", parola);
//		List<Strnomi03> listKanagraNomi = strnomi03Mapper.selectKanagra(param);
//		for (int i = 0; i < listKanagraNomi.size(); i++) {
//			listKanagra.add(listKanagraNomi.get(i).getKanagra());
//		} 
		return listKanagra;
	}
}
