package com.megagao.production.ssm.service;

import java.util.List;

import com.megagao.production.ssm.domain.Branch;
import com.megagao.production.ssm.domain.customize.EUDataGridResult;

public interface BranchService {
	public List<Branch> find();
	/**
	 * 分页插件查询
	 * 
	 */
	EUDataGridResult getList(int page,int rows)throws Exception;
}
