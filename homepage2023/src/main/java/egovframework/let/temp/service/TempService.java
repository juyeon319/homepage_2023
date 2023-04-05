package egovframework.let.temp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("tempMapper")
public interface TempService {
	//임시데이터 가져오기
	public TempVO selectTemp(TempVO vo) throws Exception;
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception;
	
	//임시데이터 등록하기
		public String insertTemp(TempVO vo) throws Exception;
	}

