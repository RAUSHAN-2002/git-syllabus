public class Main {
  1. Introduction to Git
   What is Git?
   Why is it called a distributed version control system?
   Difference between Git and GitHub.

2. Git Architecture
   Working Directory


   Staging Area (Index)


   Local Repository


   Remote Repository


3. Basic Git Commands
   git init


   git clone


   git status


   git add

   git commit

   git push

   git pull

   git fetch

4. Branching and Merging
   Create a branch (git branch <branch-name>)

   Switch branches (git checkout <branch-name>)

   Create and switch together (git checkout -b <branch-name>)

   Merge branches (git merge <branch-name>)

   Delete a branch (git branch -d <branch-name>)

   Fast-forward merge vs 3-way merge

5. Conflict Resolution
   What is a merge conflict?

   How to resolve merge conflicts manually?

   Tools for resolving conflicts (e.g., VS Code Git UI, IntelliJ)

6. Git Rebase
   What is git rebase?

   Difference between git merge and git rebase

   When to use rebase

   Danger of rebasing shared branches

7. Undoing Changes
   git reset (soft, mixed, hard)

   git revert

   git checkout -- <filename> to discard changes

   git restore (if using newer Git)

8. Stashing
   What is git stash?

   git stash save

   git stash pop

   When to use stash

9. Tagging
   Create tags (git tag v1.0)

   Push tags (git push origin v1.0)

   Difference between lightweight and annotated tags

10. Cherry-pick
   What is git cherry-pick?

   Use case: Picking a single commit from another branch

11. Git Hooks (basic knowledge)
   What are Git hooks?

   Example: pre-commit hook to run code formatter or tests

12. Submodules (basic idea)
   Managing Git repositories inside another Git repo (rare, but good to know basics)

13. Git Bisect (basic idea)
   Find which commit introduced a bug

14. Best Practices
   Always pull before pushing

   Feature branching strategy

   Clear and meaningful commit messages

   Using .gitignore file properly

   Never commit sensitive information (like passwords, API keys)

15. Real-World Git Workflow
   Feature branch ➔ commit ➔ pull ➔ push ➔ pull request ➔ code review ➔ merge

   Handling hotfixes

   Creating and managing releases using tags

16. Git Tools Experience
   Mention if you used GitHub, GitLab, Bitbucket

   Git GUI tools like GitHub Desktop, SourceTree, or Git support in IntelliJ / VS Code
}
