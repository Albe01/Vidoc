package it.vidoc.mybatis.javamodel;

import java.util.ArrayList;
import java.util.List;

public class StrcodcomresExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public StrcodcomresExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table strcodcomres
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table strcodcomres
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

		public Criteria andKanagraIsNull() {
			addCriterion("kanagra is null");
			return (Criteria) this;
		}

		public Criteria andKanagraIsNotNull() {
			addCriterion("kanagra is not null");
			return (Criteria) this;
		}

		public Criteria andKanagraEqualTo(Long value) {
			addCriterion("kanagra =", value, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraNotEqualTo(Long value) {
			addCriterion("kanagra <>", value, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraGreaterThan(Long value) {
			addCriterion("kanagra >", value, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraGreaterThanOrEqualTo(Long value) {
			addCriterion("kanagra >=", value, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraLessThan(Long value) {
			addCriterion("kanagra <", value, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraLessThanOrEqualTo(Long value) {
			addCriterion("kanagra <=", value, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraIn(List<Long> values) {
			addCriterion("kanagra in", values, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraNotIn(List<Long> values) {
			addCriterion("kanagra not in", values, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraBetween(Long value1, Long value2) {
			addCriterion("kanagra between", value1, value2, "kanagra");
			return (Criteria) this;
		}

		public Criteria andKanagraNotBetween(Long value1, Long value2) {
			addCriterion("kanagra not between", value1, value2, "kanagra");
			return (Criteria) this;
		}

		public Criteria andParolaIsNull() {
			addCriterion("parola is null");
			return (Criteria) this;
		}

		public Criteria andParolaIsNotNull() {
			addCriterion("parola is not null");
			return (Criteria) this;
		}

		public Criteria andParolaEqualTo(String value) {
			addCriterion("parola =", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaNotEqualTo(String value) {
			addCriterion("parola <>", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaGreaterThan(String value) {
			addCriterion("parola >", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaGreaterThanOrEqualTo(String value) {
			addCriterion("parola >=", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaLessThan(String value) {
			addCriterion("parola <", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaLessThanOrEqualTo(String value) {
			addCriterion("parola <=", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaLike(String value) {
			addCriterion("parola like", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaNotLike(String value) {
			addCriterion("parola not like", value, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaIn(List<String> values) {
			addCriterion("parola in", values, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaNotIn(List<String> values) {
			addCriterion("parola not in", values, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaBetween(String value1, String value2) {
			addCriterion("parola between", value1, value2, "parola");
			return (Criteria) this;
		}

		public Criteria andParolaNotBetween(String value1, String value2) {
			addCriterion("parola not between", value1, value2, "parola");
			return (Criteria) this;
		}

		public Criteria andDateflussoIsNull() {
			addCriterion("dateflusso is null");
			return (Criteria) this;
		}

		public Criteria andDateflussoIsNotNull() {
			addCriterion("dateflusso is not null");
			return (Criteria) this;
		}

		public Criteria andDateflussoEqualTo(String value) {
			addCriterion("dateflusso =", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotEqualTo(String value) {
			addCriterion("dateflusso <>", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoGreaterThan(String value) {
			addCriterion("dateflusso >", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoGreaterThanOrEqualTo(String value) {
			addCriterion("dateflusso >=", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoLessThan(String value) {
			addCriterion("dateflusso <", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoLessThanOrEqualTo(String value) {
			addCriterion("dateflusso <=", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoLike(String value) {
			addCriterion("dateflusso like", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotLike(String value) {
			addCriterion("dateflusso not like", value, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoIn(List<String> values) {
			addCriterion("dateflusso in", values, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotIn(List<String> values) {
			addCriterion("dateflusso not in", values, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoBetween(String value1, String value2) {
			addCriterion("dateflusso between", value1, value2, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDateflussoNotBetween(String value1, String value2) {
			addCriterion("dateflusso not between", value1, value2, "dateflusso");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsIsNull() {
			addCriterion("datatimeins is null");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsIsNotNull() {
			addCriterion("datatimeins is not null");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsEqualTo(String value) {
			addCriterion("datatimeins =", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsNotEqualTo(String value) {
			addCriterion("datatimeins <>", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsGreaterThan(String value) {
			addCriterion("datatimeins >", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsGreaterThanOrEqualTo(String value) {
			addCriterion("datatimeins >=", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsLessThan(String value) {
			addCriterion("datatimeins <", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsLessThanOrEqualTo(String value) {
			addCriterion("datatimeins <=", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsLike(String value) {
			addCriterion("datatimeins like", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsNotLike(String value) {
			addCriterion("datatimeins not like", value, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsIn(List<String> values) {
			addCriterion("datatimeins in", values, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsNotIn(List<String> values) {
			addCriterion("datatimeins not in", values, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsBetween(String value1, String value2) {
			addCriterion("datatimeins between", value1, value2, "datatimeins");
			return (Criteria) this;
		}

		public Criteria andDatatimeinsNotBetween(String value1, String value2) {
			addCriterion("datatimeins not between", value1, value2, "datatimeins");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table strcodcomres
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
     * This class corresponds to the database table strcodcomres
     *
     * @mbggenerated do_not_delete_during_merge Thu Apr 18 09:27:24 CEST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}