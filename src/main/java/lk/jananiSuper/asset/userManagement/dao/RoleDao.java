package lk.jananiSuper.asset.userManagement.dao;

import lk.jananiSuper.asset.userManagement.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository< Role, Integer > {
    Role findByRoleName(String roleName);
}
