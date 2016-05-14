package it.vidoc.mybatis.javamodel;

import java.util.ArrayList;
import java.util.List;

public class MatrixabilitazioniExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public MatrixabilitazioniExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
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
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table matrixabilitazioni
     *
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table matrixabilitazioni
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table matrixabilitazioni
     *
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
}