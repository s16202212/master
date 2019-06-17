package webadv.s16202212.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import webadv.s16202212.entity.Math;

@Mapper
public class MathRepository {

	@Results(id="MathMap", value={ 
		    @Result(property = "t_id", column = "t_id",  jdbcType=JdbcType.INTEGER), 
		    @Result(property = "t_timu", column = "t_timu"),
		    @Result(property = "t_num1", column = "t_num1"),
		    @Result(property = "t_fuhao", column = "t_fuhao"),
		    @Result(property = "t_num2", column = "t_num2")
			})

			@Select("select * from t_shuxue") 
			public List<Math> findAll(); 
//	@Insert("INSERT INTO MathMap (`t_id`, `t_timu`, `t_num1` , `t_fuhao`, `t_fuhao`) VALUES (#{t_id},#{t_timu}, #{t_num1},#{t_fuhao},#{t_num2})")
//	@ResultMap(value="MathMap")
//	public void insert(@Param("t_id")String t_id,@Param("t_timu")String t_timu,@Param("t_num1")String t_num1,@Param("t_fuhao")String t_fuhao,@Param("t_num2")String t_num2);

		
	
}
