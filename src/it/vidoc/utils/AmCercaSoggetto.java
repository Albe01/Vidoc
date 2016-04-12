package it.vidoc.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.vidoc.mybatis.sqlquery.SqlAnagrafiche;

public class AmCercaSoggetto {

	public List<Long> amCercaSoggetto(String nome, String indirizzo, String siglaProvincia, String codiceComune) {
	
		ParamQuery paramQuery = null;
		List<ParamQuery> listParole = new ArrayList<ParamQuery>();
		Map<String, List<ParamQuery>> map = new HashMap<String, List<ParamQuery>>();
		nome = nome.replaceAll(" {2,}", " ");
		String[] arrParole = nome.trim().split(" ");
		for (int i = 0; i < arrParole.length; i++) {
			if (!"".equals(arrParole[i]) && arrParole[i] != null) {
				if (arrParole[i].trim().length() > 0) {
					switch (arrParole[i].length()) {
					case 1: case 2: case 3:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi03");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 4:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi04");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 5:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi05");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 6:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi06");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 7:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi07");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 8:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi08");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 9: case 10:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi10");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					case 11: case 12: case 13: case 14: case 15:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi15");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					default:
						paramQuery = new ParamQuery();
						paramQuery.setTableName("strnomi20");
						paramQuery.setParola(arrParole[i].trim());
						listParole.add(paramQuery);
				        break;
					}
				}
			}
		}
		if (!"".equals(codiceComune) && codiceComune != null && !codiceComune.startsWith("-")) {
			paramQuery = new ParamQuery();
			paramQuery.setTableName("strcodcomres");
			paramQuery.setParola(codiceComune.trim());
			listParole.add(paramQuery);

		}
		if (!"".equals(siglaProvincia) && siglaProvincia != null) {
			paramQuery = new ParamQuery();
			paramQuery.setTableName("strcodprvres");
			paramQuery.setParola(siglaProvincia.trim());
			listParole.add(paramQuery);
		}
		
		map.put("parametri", listParole);

		return new SqlAnagrafiche().selectIn(map);

//		Map<String,List<String>> map =  new HashMap<String,List<String>>();
//		List<String> lstParole03 =  null;
//		List<String> lstParole04 =  null;
//		List<String> lstParole05 =  null;
//		List<String> lstParole06 =  null;
//		List<String> lstParole07 =  null;
//		List<String> lstParole08 =  null;
//		List<String> lstParole10 =  null;
//		List<String> lstParole15 =  null;
//		List<String> lstParole20 =  null;
//		List<String> lstCodCom =  null;
//		List<String> lstSiglaPrv =  null;
//		nome = nome.replaceAll(" {2,}", " ");
//		String[] arrParole = nome.trim().split(" ");
//		for (int i = 0; i < arrParole.length; i++) {
//			if (!"".equals(arrParole[i]) && arrParole[i] != null) {
//				if (arrParole[i].trim().length() > 0) {
//					switch (arrParole[i].length()) {
//					case 1: case 2: case 3:
//						if (lstParole03 == null) {lstParole03 = new ArrayList<String>();}
//						lstParole03.add(arrParole[i].trim());
//				        map.put("strnomi03", lstParole03);
//				        break;
//					case 4:
//						if (lstParole04 == null) {lstParole04 = new ArrayList<String>();}
//						lstParole04.add(arrParole[i].trim());
//				        map.put("strnomi04", lstParole04);
//				        break;
//					case 5:
//						if (lstParole05 == null) {lstParole05 = new ArrayList<String>();}
//						lstParole05.add(arrParole[i].trim());
//				        map.put("strnomi05", lstParole05);
//				        break;
//					case 6:
//						if (lstParole06 == null) {lstParole06 = new ArrayList<String>();}
//						lstParole06.add(arrParole[i].trim());
//				        map.put("strnomi06", lstParole06);
//				        break;
//					case 7:
//						if (lstParole07 == null) {lstParole07 = new ArrayList<String>();}
//						lstParole07.add(arrParole[i].trim());
//				        map.put("strnomi07", lstParole07);
//				        break;
//					case 8:
//						if (lstParole08 == null) {lstParole08 = new ArrayList<String>();}
//						lstParole08.add(arrParole[i].trim());
//				        map.put("strnomi08", lstParole08);
//				        break;
//					case 9: case 10:
//						if (lstParole10 == null) {lstParole10 = new ArrayList<String>();}
//						lstParole10.add(arrParole[i].trim());
//				        map.put("strnomi10", lstParole10);
//				        break;
//					case 11: case 12: case 13: case 14: case 15:
//						if (lstParole15 == null) {lstParole15 = new ArrayList<String>();}
//						lstParole15.add(arrParole[i].trim());
//				        map.put("strnomi15", lstParole15);
//				        break;
//					default:
//						if (lstParole20 == null) {lstParole20 = new ArrayList<String>();}
//						lstParole20.add(arrParole[i].trim());
//				        map.put("strnomi20", lstParole20);
//				        break;
//					}
//				}
//			}
//		}
//		if (!"".equals(codiceComune) && codiceComune != null && !codiceComune.startsWith("-")) {
//			lstCodCom = new ArrayList<String>();
//			lstCodCom.add(codiceComune.trim());
//			map.put("strcodcomres", lstCodCom);
//		}
//		if (!"".equals(siglaProvincia) && siglaProvincia != null) {
//			lstSiglaPrv = new ArrayList<String>();
//			lstSiglaPrv.add(siglaProvincia.trim());
//			map.put("strcodprvres", lstSiglaPrv);
//		}
//		return new SqlAnagrafiche().selectIn(map);

	
	
		
		
		
		
	

////	if (result.size() > 0) {
////		if (provincia.length() > 1) {
////			listKanagra1 = new SqlStrPrvRes().GetStrPrvRes(provincia);
////			if (listKanagra1.size() < 1) {
////				result.clear();
////			} else {
////				ArrayList<Integer> tmpL = new IntersectKanagra().IntersectKanagra(listKanagra1, result);
////				result.clear();
////				result.addAll(tmpL);
////			}
////		}
////	}
//	
//	return result;
//}

	
//	public List<Integer> amCercaSoggetto(String nome, String indirizzo, String provincia, String comune) {
//		List<Integer> listKanagra1 = new ArrayList<Integer>();
//		List<Integer> listKanagra2 = new ArrayList<Integer>();
//		List<Integer> result = new ArrayList<Integer>();
//
//		nome = nome.replaceAll(" {2,}", " ");
//		String[] arrParole = nome.trim().split(" ");
//		
//		for (int i = 0; i < arrParole.length; i++) {
//			if (i == 0) {
//				listKanagra1 = new SqlStrNomi().getStrNomi(arrParole[i].trim());
//				result.clear();
//				result.addAll(listKanagra1);
//			} else {
//				listKanagra2 = new SqlStrNomi().getStrNomi(arrParole[i].trim());
//				ArrayList<Integer> tmpL = new IntersectKanagra().IntersectKanagra(listKanagra1, listKanagra2);
//				result.clear();
//				result.addAll(tmpL);
//				listKanagra1.clear();
//				listKanagra1.addAll(result);
//			}
//		}
//		
//		if (result.size() > 0) {
//			if (comune.length() > 1) {
//				if (!(comune.equals("-----"))) {
//					listKanagra1 = new SqlStrComRes().getStrComRes(comune);
//					if (listKanagra1.size() < 1) {
//						result.clear();
//					} else {
//						ArrayList<Integer> tmpL = new IntersectKanagra().IntersectKanagra(listKanagra1, result);
//						result.clear();
//						result.addAll(tmpL);
//					}
//				} else {
//					if (provincia.length() > 1) {
//						listKanagra1 = new SqlStrPrvRes().GetStrPrvRes(provincia);
//						if (listKanagra1.size() < 1) {
//							result.clear();
//						} else {
//							ArrayList<Integer> tmpL = new IntersectKanagra().IntersectKanagra(listKanagra1, result);
//							result.clear();
//							result.addAll(tmpL);
//						}
//					}
//				}
//			}
//		}
//		
////		if (result.size() > 0) {
////			if (provincia.length() > 1) {
////				listKanagra1 = new SqlStrPrvRes().GetStrPrvRes(provincia);
////				if (listKanagra1.size() < 1) {
////					result.clear();
////				} else {
////					ArrayList<Integer> tmpL = new IntersectKanagra().IntersectKanagra(listKanagra1, result);
////					result.clear();
////					result.addAll(tmpL);
////				}
////			}
////		}
//		
//		return result;
//	}
	
	
	}
}