# git-test-practice
git test &amp; practice repository <br><br><br>



## [Git study external memory storage]   
https://positive1.notion.site/VSC-Git-403b37665db34a29a9a9d9ab97f33d92 <br><br><br>



## git 명령어   

git grep [검색어]    
git grep -i 검색어 // 대소문자 구분(case sensitive) x    
git grep -w 검색어 // 독립된 한 단어만 검색 ex) everyday에 day검색 : 검색x    


git stash clear    :  모든 stash 일괄 삭제   
git stash apply    : stash 적용 & 적용 후, 해당 stash 보관  
git stash pop      : stash 적용 & 적용 후, 해당 stash 삭제  
git stash show     : stash의 변경사항 확인  
git stash show -p  : 변경 사항의 내용을 디테일하게 보기  
git stash show --patch  
git stash branch <branch_name>  : 새로운 브랜치를 만들고 스태시를 적용  
    ※ stash 후 이전 커밋으로 돌아가므로 상태유지할려면 stash apply 필수


git cherry-pick [commit hash] : 현재 머물러있는 브랜치에서 해당 commit hash를 체리픽 해오기   
git cherry-pick -n [커밋 해시]  : 체리픽 해오면서 자동 커밋 금지  
git cherry-pick --no-commit [커밋 해시]  
git cherry-pick -e [커밋 해시]  : 체리픽 해오면서 커밋메세지 수정    
git cherry-pick --edit [커밋 해시]  

git diff   
git diff HEAD   
git diff --staged   
git diff [branchname1]..[branchname2]   

git log   
git log -- pretty=oneline   
git log -p   
git log --patch   
git log --patch -2   
git log --graph --decorate --oneline   
git log [branchname1]..[branchname2]    
git log -p [branchname1]..[branchname2]    
git log --grep [검색어]  
 
git add -p : 변경된 파일들의 코드를 하나씩 보여주고, 스테이지(index)에 올릴지 말지 선택하게하는 옵션   


git revert [commit hash] : 해당 해쉬의 커밋 되돌리기   
git revert HEAD : 바로 직전에 작업한 내용 되돌리기   
git revert --no-commit : revert한 결과를 stage 상태만 유지하고, no commit    
git revert [commit hash1]..[commit hash2] : 여러 커밋 되돌리기   
git revert -m [순서번호] [commit hash] : 머지커밋 되돌리기   
git revert --continue : 충돌 해결 및 런   
git revert --skip : 되돌리지만 이 패치 스킵  
git revert --abort : 되돌리기 취소    


git rm [파일명] : 로컬,리모트 파일 삭제         // remote o, local o   
git rm --cached [파일명] : 리모트만 파일 삭제   // remote o, local x   
git rm -n : 삭제될 파일 프리뷰(메세지는 뜨나 실제 삭제는 x)   
git rm --cached -r [디렉토리명] : 디렉토리 전체 삭제   


git reset HEAD : 이전 add 전체 unstage
git show HEAD^ : HEAD 바로 전 커밋으로 reset
git reset HEAD 파일명 : 해당 파일을 unstage로

cf. HEAD와 HEAD^ 위치 파악하는 방법   
git log --pretty=oneline -5   
git show HEAD    
git show HEAD^    


git clean -f       : 디렉터리를 제외한 파일들만 삭제    
git clean -f -n    : 어떤 파일이 지워질 지 알려줌    
git clean -f -d    : 디렉터리까지 삭제    
git clean -f -d -x : ignore로 무시된 파일까지 삭제    






<br><br><br>    

## git 상황 별

#### Working Directory 변경사항 취소하기  
```java
git checkout -- .
```

<br><br>

#### 다른브랜치의 커밋을 cherry-pick하다 충돌 났을 경우
```java
git reset --hard [commit hash]  // main에서 main의 이전 커밋id
git cherry-pick  [commit hash]  // main에서 local커밋 중 가져올 커밋id
```

<br><br>

#### 마지막 커밋 내역 제외한 이전 커밋 삭제하기
```java
git reset --hard HEAD~n    // `n` :** 지우고자 하는 이전 커밋의 수
```  
ex)  
```java
git reset --hard HEAD~2 // 현재커밋 제외한 이전 2개의 커밋 삭제

// 커밋id가 1-10이 있다고 가정하고 가장 최근 커밋이 10
// 10을 제외한 6-9까지의 커밋 내역을 삭제할려면
git reset --hard HEAD~4   // 1-5와 10의 커밋내역이 남음
```  
```java
git reset --hard HEAD~n
git push origin [브랜치명] --force // reset 이후 강제 푸쉬 해야함
```

- **`--force`** : 강제로 푸쉬하는 옵션

위 단계를 따르면 원하는 커밋만 남기고 나머지는 삭제할 수 있습니다. 주의해서 사용하시기 바랍니다.


<br><br><br>    



