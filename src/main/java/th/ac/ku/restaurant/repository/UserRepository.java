package th.ac.ku.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.restaurant.model.User;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    // SELECT * FROM User WHERE username = ‘username in parameter’
    User findByUsername(String username);
    // ถ้าชื่อ method เป็น findBy[x] แล้ว x เป็นตัวแปรใน User
    // หมายความว่ากำหนดแบบว่างๆ ได้เลย เพราะโปรแกรมรู้ว่าให้หาตัวไหน
}
