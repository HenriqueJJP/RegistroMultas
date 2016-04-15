package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Onibus.class)
public abstract class Onibus_ {

	public static volatile SingularAttribute<Onibus, String> motorista;
	public static volatile SingularAttribute<Onibus, Linha> linha;
	public static volatile SingularAttribute<Onibus, Long> id;
	public static volatile SingularAttribute<Onibus, Empresa> empresa;
	public static volatile SingularAttribute<Onibus, String> placa;

}

