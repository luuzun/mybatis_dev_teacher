package kr.or.dgit.mybatis_dev_teacher.persistences;

import org.apache.ibatis.annotations.Select;

import kr.or.dgit.mybatis_dev_teacher.dto.Address;

public interface AddressMapper {
    
	@Select("SELECT ADDR_ID AS ADDRID, STREET, CITY, STATE, ZIP, COUNTRY FROM ADDRESSES WHERE ADDR_ID=#{id}")
	Address selectAddressById(int id);

}
