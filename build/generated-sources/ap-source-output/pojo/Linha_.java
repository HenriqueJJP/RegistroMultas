package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Linha.class)
public abstract class Linha_ {

	public static volatile SingularAttribute<Linha, String> vazao;
	public static volatile SingularAttribute<Linha, String> proximidade;
	public static volatile SingularAttribute<Linha, String> nome;
	public static volatile SingularAttribute<Linha, Long> id;
	public static volatile SingularAttribute<Linha, Integer> temp_viagem;
	public static volatile SingularAttribute<Linha, Integer> qtd_onibus;
	public static volatile SingularAttribute<Linha, String> rota;
	public static volatile ListAttribute<Linha, Onibus> onibus;

}

