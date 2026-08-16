# Progress

Last updated: 2026-08-16

This file is a human-readable snapshot, updated only when real progress is
recorded — not a live view. The DSA Accountability app's own database is the
authoritative source for mastery/session state.

## App-tracked progress (flexible topic/session engine)

| Metric | Value |
|---|---:|
| Practice sessions built | 0 |
| Problems solved (fresh Accepted, app-verified) | 0 |
| Local exercises completed (via a session) | 0 |
| Revisions completed | 0 |
| Topics with any tracked mastery | 0 / 41 |

Genuinely zero — no practice session has been built through the app yet.
This is not a bug or a fabricated placeholder; see the section below for real
work that predates the app's topic/session engine.

## Existing Git work not yet reflected in app mastery

Two local Java exercises were completed (real, working solutions, verified
against their actual committed content, not assumed from a commit message)
before the app switched from its original day-based model to the current
topic/session engine. Their commits are real; the app's own mastery tracking
doesn't have session-based evidence for them yet because they were never
finalized through a practice session:

| Exercise | Topic | Commit |
|---|---|---|
| Even/Odd | Java Foundations — Conditionals | `54df245` |
| Maximum of Three | Java Foundations — Conditionals | `527dedb` |

Two exercises are genuinely NOT done yet, despite living under `Topics/` now
(moving a file does not mean it's solved — verified by reading the actual
file content, not inferred from its presence):

- **Simple Calculator** (Java Foundations — Operators): a real, uncommitted
  solution is written but not yet finalized through the app.
- **Leap Year** (Java Foundations — Conditionals): still the unmodified
  starter skeleton. Not started.

## Curriculum-day log (historical, pre-topic-engine)

| Day | Topic | Original due date | Status |
|---:|---|---|---|
| 1 | Java Fundamentals I | 2026-08-15 | In progress (see above) |

See [CURRICULUM.md](CURRICULUM.md) for why this log stops at Day 1 and is not
being continued.
