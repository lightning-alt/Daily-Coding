# Daily Coding Strike 🔥

Welcome to my daily coding challenge repository! This repo tracks my daily coding solutions and progress.

## 📁 Structure

Solutions are organized by date:
```
Solutions/
├── 2026-09-09/
│   ├── README.md
│   ├── solution.py
│   └── notes.md
├── 2026-09-10/
│   ├── README.md
│   └── solution.py
```

## 🚀 Automation

This repository uses **GitHub Actions** to automatically create daily commits, maintaining your coding strike streak.

### Workflow Details
- **Trigger**: Runs automatically every day at 9 AM UTC (you can customize in `.github/workflows/daily-commit.yml`)
- **Action**: Creates a new directory with today's date and initializes a README
- **Manual Trigger**: You can also run it anytime via the "Run workflow" button in GitHub Actions

## 📝 How to Add Your Daily Code

1. **Before the workflow runs** (or anytime): Add your solution files
2. **Manually push** your code to create entries:
   ```bash
   mkdir -p "Solutions/$(date +%Y-%m-%d)"
   # Add your code files here
   git add .
   git commit -m "Daily coding update: $(date +%Y-%m-%d)"
   git push
   ```

3. **View your streak**: Check the GitHub contribution graph to see your daily coding activity!

## 🎯 Tips for Success

- Solve at least one problem per day
- Document your approach in README files
- Keep solutions organized by date for easy reference
- The automated workflow ensures you never miss a day in your streak

---

Happy Coding! 💪
