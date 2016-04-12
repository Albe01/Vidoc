package it.vidoc.mybatis.javamodel;

import java.util.ArrayList;
import java.util.List;

public class ListinoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table listino
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table listino
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table listino
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public ListinoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table listino
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table listino
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andProgrrigaIsNull() {
			addCriterion("progrriga is null");
			return (Criteria) this;
		}

		public Criteria andProgrrigaIsNotNull() {
			addCriterion("progrriga is not null");
			return (Criteria) this;
		}

		public Criteria andProgrrigaEqualTo(Integer value) {
			addCriterion("progrriga =", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaNotEqualTo(Integer value) {
			addCriterion("progrriga <>", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaGreaterThan(Integer value) {
			addCriterion("progrriga >", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaGreaterThanOrEqualTo(Integer value) {
			addCriterion("progrriga >=", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaLessThan(Integer value) {
			addCriterion("progrriga <", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaLessThanOrEqualTo(Integer value) {
			addCriterion("progrriga <=", value, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaIn(List<Integer> values) {
			addCriterion("progrriga in", values, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaNotIn(List<Integer> values) {
			addCriterion("progrriga not in", values, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaBetween(Integer value1, Integer value2) {
			addCriterion("progrriga between", value1, value2, "progrriga");
			return (Criteria) this;
		}

		public Criteria andProgrrigaNotBetween(Integer value1, Integer value2) {
			addCriterion("progrriga not between", value1, value2, "progrriga");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoIsNull() {
			addCriterion("numerolistino is null");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoIsNotNull() {
			addCriterion("numerolistino is not null");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoEqualTo(Integer value) {
			addCriterion("numerolistino =", value, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoNotEqualTo(Integer value) {
			addCriterion("numerolistino <>", value, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoGreaterThan(Integer value) {
			addCriterion("numerolistino >", value, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoGreaterThanOrEqualTo(Integer value) {
			addCriterion("numerolistino >=", value, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoLessThan(Integer value) {
			addCriterion("numerolistino <", value, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoLessThanOrEqualTo(Integer value) {
			addCriterion("numerolistino <=", value, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoIn(List<Integer> values) {
			addCriterion("numerolistino in", values, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoNotIn(List<Integer> values) {
			addCriterion("numerolistino not in", values, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoBetween(Integer value1, Integer value2) {
			addCriterion("numerolistino between", value1, value2, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andNumerolistinoNotBetween(Integer value1, Integer value2) {
			addCriterion("numerolistino not between", value1, value2, "numerolistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoIsNull() {
			addCriterion("codicelistino is null");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoIsNotNull() {
			addCriterion("codicelistino is not null");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoEqualTo(String value) {
			addCriterion("codicelistino =", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoNotEqualTo(String value) {
			addCriterion("codicelistino <>", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoGreaterThan(String value) {
			addCriterion("codicelistino >", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoGreaterThanOrEqualTo(String value) {
			addCriterion("codicelistino >=", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoLessThan(String value) {
			addCriterion("codicelistino <", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoLessThanOrEqualTo(String value) {
			addCriterion("codicelistino <=", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoLike(String value) {
			addCriterion("codicelistino like", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoNotLike(String value) {
			addCriterion("codicelistino not like", value, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoIn(List<String> values) {
			addCriterion("codicelistino in", values, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoNotIn(List<String> values) {
			addCriterion("codicelistino not in", values, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoBetween(String value1, String value2) {
			addCriterion("codicelistino between", value1, value2, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicelistinoNotBetween(String value1, String value2) {
			addCriterion("codicelistino not between", value1, value2, "codicelistino");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiIsNull() {
			addCriterion("codicebancadati is null");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiIsNotNull() {
			addCriterion("codicebancadati is not null");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiEqualTo(String value) {
			addCriterion("codicebancadati =", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiNotEqualTo(String value) {
			addCriterion("codicebancadati <>", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiGreaterThan(String value) {
			addCriterion("codicebancadati >", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiGreaterThanOrEqualTo(String value) {
			addCriterion("codicebancadati >=", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiLessThan(String value) {
			addCriterion("codicebancadati <", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiLessThanOrEqualTo(String value) {
			addCriterion("codicebancadati <=", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiLike(String value) {
			addCriterion("codicebancadati like", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiNotLike(String value) {
			addCriterion("codicebancadati not like", value, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiIn(List<String> values) {
			addCriterion("codicebancadati in", values, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiNotIn(List<String> values) {
			addCriterion("codicebancadati not in", values, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiBetween(String value1, String value2) {
			addCriterion("codicebancadati between", value1, value2, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicebancadatiNotBetween(String value1, String value2) {
			addCriterion("codicebancadati not between", value1, value2, "codicebancadati");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaIsNull() {
			addCriterion("codicerichiesta is null");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaIsNotNull() {
			addCriterion("codicerichiesta is not null");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaEqualTo(String value) {
			addCriterion("codicerichiesta =", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaNotEqualTo(String value) {
			addCriterion("codicerichiesta <>", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaGreaterThan(String value) {
			addCriterion("codicerichiesta >", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaGreaterThanOrEqualTo(String value) {
			addCriterion("codicerichiesta >=", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaLessThan(String value) {
			addCriterion("codicerichiesta <", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaLessThanOrEqualTo(String value) {
			addCriterion("codicerichiesta <=", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaLike(String value) {
			addCriterion("codicerichiesta like", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaNotLike(String value) {
			addCriterion("codicerichiesta not like", value, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaIn(List<String> values) {
			addCriterion("codicerichiesta in", values, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaNotIn(List<String> values) {
			addCriterion("codicerichiesta not in", values, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaBetween(String value1, String value2) {
			addCriterion("codicerichiesta between", value1, value2, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerichiestaNotBetween(String value1, String value2) {
			addCriterion("codicerichiesta not between", value1, value2, "codicerichiesta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaIsNull() {
			addCriterion("codicerisposta is null");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaIsNotNull() {
			addCriterion("codicerisposta is not null");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaEqualTo(String value) {
			addCriterion("codicerisposta =", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaNotEqualTo(String value) {
			addCriterion("codicerisposta <>", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaGreaterThan(String value) {
			addCriterion("codicerisposta >", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaGreaterThanOrEqualTo(String value) {
			addCriterion("codicerisposta >=", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaLessThan(String value) {
			addCriterion("codicerisposta <", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaLessThanOrEqualTo(String value) {
			addCriterion("codicerisposta <=", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaLike(String value) {
			addCriterion("codicerisposta like", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaNotLike(String value) {
			addCriterion("codicerisposta not like", value, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaIn(List<String> values) {
			addCriterion("codicerisposta in", values, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaNotIn(List<String> values) {
			addCriterion("codicerisposta not in", values, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaBetween(String value1, String value2) {
			addCriterion("codicerisposta between", value1, value2, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andCodicerispostaNotBetween(String value1, String value2) {
			addCriterion("codicerisposta not between", value1, value2, "codicerisposta");
			return (Criteria) this;
		}

		public Criteria andPrezzoIsNull() {
			addCriterion("prezzo is null");
			return (Criteria) this;
		}

		public Criteria andPrezzoIsNotNull() {
			addCriterion("prezzo is not null");
			return (Criteria) this;
		}

		public Criteria andPrezzoEqualTo(Double value) {
			addCriterion("prezzo =", value, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoNotEqualTo(Double value) {
			addCriterion("prezzo <>", value, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoGreaterThan(Double value) {
			addCriterion("prezzo >", value, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoGreaterThanOrEqualTo(Double value) {
			addCriterion("prezzo >=", value, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoLessThan(Double value) {
			addCriterion("prezzo <", value, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoLessThanOrEqualTo(Double value) {
			addCriterion("prezzo <=", value, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoIn(List<Double> values) {
			addCriterion("prezzo in", values, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoNotIn(List<Double> values) {
			addCriterion("prezzo not in", values, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoBetween(Double value1, Double value2) {
			addCriterion("prezzo between", value1, value2, "prezzo");
			return (Criteria) this;
		}

		public Criteria andPrezzoNotBetween(Double value1, Double value2) {
			addCriterion("prezzo not between", value1, value2, "prezzo");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaIsNull() {
			addCriterion("dirittisegreteria is null");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaIsNotNull() {
			addCriterion("dirittisegreteria is not null");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaEqualTo(Double value) {
			addCriterion("dirittisegreteria =", value, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaNotEqualTo(Double value) {
			addCriterion("dirittisegreteria <>", value, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaGreaterThan(Double value) {
			addCriterion("dirittisegreteria >", value, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaGreaterThanOrEqualTo(Double value) {
			addCriterion("dirittisegreteria >=", value, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaLessThan(Double value) {
			addCriterion("dirittisegreteria <", value, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaLessThanOrEqualTo(Double value) {
			addCriterion("dirittisegreteria <=", value, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaIn(List<Double> values) {
			addCriterion("dirittisegreteria in", values, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaNotIn(List<Double> values) {
			addCriterion("dirittisegreteria not in", values, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaBetween(Double value1, Double value2) {
			addCriterion("dirittisegreteria between", value1, value2, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andDirittisegreteriaNotBetween(Double value1, Double value2) {
			addCriterion("dirittisegreteria not between", value1, value2, "dirittisegreteria");
			return (Criteria) this;
		}

		public Criteria andOnldiffIsNull() {
			addCriterion("onldiff is null");
			return (Criteria) this;
		}

		public Criteria andOnldiffIsNotNull() {
			addCriterion("onldiff is not null");
			return (Criteria) this;
		}

		public Criteria andOnldiffEqualTo(String value) {
			addCriterion("onldiff =", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffNotEqualTo(String value) {
			addCriterion("onldiff <>", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffGreaterThan(String value) {
			addCriterion("onldiff >", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffGreaterThanOrEqualTo(String value) {
			addCriterion("onldiff >=", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffLessThan(String value) {
			addCriterion("onldiff <", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffLessThanOrEqualTo(String value) {
			addCriterion("onldiff <=", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffLike(String value) {
			addCriterion("onldiff like", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffNotLike(String value) {
			addCriterion("onldiff not like", value, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffIn(List<String> values) {
			addCriterion("onldiff in", values, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffNotIn(List<String> values) {
			addCriterion("onldiff not in", values, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffBetween(String value1, String value2) {
			addCriterion("onldiff between", value1, value2, "onldiff");
			return (Criteria) this;
		}

		public Criteria andOnldiffNotBetween(String value1, String value2) {
			addCriterion("onldiff not between", value1, value2, "onldiff");
			return (Criteria) this;
		}

		public Criteria andPosnegIsNull() {
			addCriterion("posneg is null");
			return (Criteria) this;
		}

		public Criteria andPosnegIsNotNull() {
			addCriterion("posneg is not null");
			return (Criteria) this;
		}

		public Criteria andPosnegEqualTo(String value) {
			addCriterion("posneg =", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegNotEqualTo(String value) {
			addCriterion("posneg <>", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegGreaterThan(String value) {
			addCriterion("posneg >", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegGreaterThanOrEqualTo(String value) {
			addCriterion("posneg >=", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegLessThan(String value) {
			addCriterion("posneg <", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegLessThanOrEqualTo(String value) {
			addCriterion("posneg <=", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegLike(String value) {
			addCriterion("posneg like", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegNotLike(String value) {
			addCriterion("posneg not like", value, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegIn(List<String> values) {
			addCriterion("posneg in", values, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegNotIn(List<String> values) {
			addCriterion("posneg not in", values, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegBetween(String value1, String value2) {
			addCriterion("posneg between", value1, value2, "posneg");
			return (Criteria) this;
		}

		public Criteria andPosnegNotBetween(String value1, String value2) {
			addCriterion("posneg not between", value1, value2, "posneg");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table listino
	 * @mbggenerated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table listino
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}