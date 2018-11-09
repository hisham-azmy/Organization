package com.org.service;

import com.org.dao.SettingsDao;
import com.org.model.IoSettings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SettingsServiceImpl implements SettingsServcie {

	@Autowired
	private SettingsDao settingsDao;

	@Override
	public void AddSettings(IoSettings ioSettings) {
		settingsDao.AddSettings(ioSettings);
	}

	@Override
	public void updateSettings(IoSettings ioSettings) {
		settingsDao.updateSettings(ioSettings);
	}

	@Override
	public void deleteSettings(int id) {
		settingsDao.deleteSettings(id);
	}

	@Override
	public List<IoSettings> getAllSettings() {
		return settingsDao.getAllSettings();
	}

	@Override
	public List<String> allNameBySettings(String name) {
		return settingsDao.allNameBySettings(name);
	}

	@Override
	public IoSettings getSettings() {
		// TODO Auto-generated method stub
		return settingsDao.getSettings();
	}

}
