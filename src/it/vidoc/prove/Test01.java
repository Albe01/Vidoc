package it.vidoc.prove;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.vidoc.mybatis.javamodel.Logelab;
import it.vidoc.mybatis.sqlquery.SqlAnagrafiche;
import it.vidoc.mybatis.sqlquery.SqlLogElab;
import it.vidoc.utils.ParamQuery;

public class Test01 {

	public static void main(String[] args) {
		
		
		Logelab le = new Logelab();
		int res;
		Integer pk = 2;
		res = new SqlLogElab().selectByPrimaryKey(pk);
		
		
		le.setDatatime("aaaaaa");
		le.setPgmelab("bbbbbb");
		le.setRiga("rrrrr");
		res = new SqlLogElab().insert(le);
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<ParamQuery> list = new ArrayList<ParamQuery>();

		ParamQuery param = new ParamQuery();
		param.setTableName("strnomi05");
		param.setParola("maria");
		list.add(param);
		
		param = new ParamQuery();
		param.setTableName("strnomi05");
		param.setParola("carlo");
		list.add(param);

		param = new ParamQuery();
		param.setTableName("strcodprvres");
		param.setParola("na");
		//list.add(param);
		
		Map<String, List<ParamQuery>> map = new HashMap<String, List<ParamQuery>>();
		map.put("parametri", list);
		
		
		
		String albe = null;
		
		List<Long> ret = null;
		ret = new SqlAnagrafiche().selectIn(map);

	}

}
