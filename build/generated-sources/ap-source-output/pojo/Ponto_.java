package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ponto.class)
public abstract class Ponto_ {

	public static volatile ListAttribute<Ponto, Veiculo> veiculo;
	public static volatile SingularAttribute<Ponto, Integer> idPonto;
	public static volatile SingularAttribute<Ponto, String> proximidade;
	public static volatile SingularAttribute<Ponto, String> nome;

}

