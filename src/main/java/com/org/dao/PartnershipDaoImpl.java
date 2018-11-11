package com.org.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.org.model.MemberPartnershipDetails;

@Repository
@Transactional
public class PartnershipDaoImpl implements PartnershipDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void AddPartnership(MemberPartnershipDetails partnership) {
		sessionFactory.getCurrentSession().save(partnership);

	}

	@Override
	public void updatePartnership(MemberPartnershipDetails partnership) {
		sessionFactory.getCurrentSession().update(partnership);
	}

	@Override
	public void deletePartnership(int id) {
		MemberPartnershipDetails partnership = (MemberPartnershipDetails) sessionFactory.getCurrentSession()
				.load(MemberPartnershipDetails.class, id);
		if (null != partnership) {
			this.sessionFactory.getCurrentSession().delete(partnership);
			this.sessionFactory.getCurrentSession().flush();
		}
	}

	@Override
	public List<MemberPartnershipDetails> getAllPartnerships() {
		Query q = sessionFactory.getCurrentSession().createQuery("from MemberPartnershipDetails");
		List<MemberPartnershipDetails> allPartnership = (List<MemberPartnershipDetails>) q.list();
		return allPartnership;
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnershipByTelephone(String telephone) {

		Query q = sessionFactory.getCurrentSession()
				.createQuery("from MemberPartnershipDetails where telephone LIKE :telephone");
		q.setParameter("name", "%" + telephone + "%");
		List<MemberPartnershipDetails> allPartnership = (List<MemberPartnershipDetails>) q.list();
		return allPartnership;
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnershipByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnershipByCode(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberPartnershipDetails getPartnershipById(int partnershipId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberPartnershipDetails> getAllNamePerPartnerships(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberPartnershipDetails> filterPartnership(String name, float min, float max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberPartnershipDetails> searchPartnership(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
